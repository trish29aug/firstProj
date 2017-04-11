package com.newStart.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.newStart.beans.UserBean;
import com.newStart.services.UserService;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request){
		System.out.println("u reached login");
		
	if(request.getParameter("userId").equals("Trish")){
		return new ModelAndView("loginSuccess");}
	else
		return new ModelAndView("error");
	}
	
	@RequestMapping("/signUp")
	public ModelAndView signUp(HttpServletRequest request){
		System.out.println("u reached");
		UserBean usr= new UserBean();
		usr.setUserId(request.getParameter("email"));
		usr.setfName(request.getParameter("fname"));
		usr.setlName(request.getParameter("lname"));
		usr.setPassword(request.getParameter("signUpPassword"));
		usr.setAge(Integer.parseInt(request.getParameter("age")));
		UserService svc= new UserService();
		svc.persistUser(usr);
		return new ModelAndView("profile");
	}

}
