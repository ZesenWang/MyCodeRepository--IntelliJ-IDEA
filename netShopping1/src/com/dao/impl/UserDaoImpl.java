package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.dao.UserDao;
import com.po.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDaoImpl implements UserDao{
	private SessionFactory sessionFactory;
	@Override
	public List<User> getData(String hql) {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();

			Session session = sessionFactory.openSession();
			list = session.createQuery(hql).list();
			session.clear();
			session.close();

		return list;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
