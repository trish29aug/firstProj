package com.newStart.services;

import com.newStart.beans.UserBean;
import com.newStart.dao.UserDao;


public class UserService {

	public void persistUser(UserBean bean){
		System.out.println(bean.getUserId());
		System.out.println(bean.getlName());
		System.out.println(bean.getfName());
		System.out.println(bean.getPassword());
		/*UserDao dao= new UserDao();
		try {
			dao.persistUser(bean);
		} catch (Exception e) {
			System.out.println("error in user service");
		}*/
	}
}
