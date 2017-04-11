package com.newStart.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.newStart.beans.UserBean;
import com.newStart.managedBeans.UserManagedBean;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager em;
	
	public void persistUser(UserBean bean){
		UserManagedBean usrMngBean= new UserManagedBean();
		usrMngBean.setUserId(bean.getUserId());
		
		usrMngBean.setAge(bean.getAge());
		try {
			em.persist(usrMngBean);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
