package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.CartDao;
import com.po.Cart;
import org.hibernate.Transaction;

public class CartDaoImpl implements CartDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Cart> getData(String hql) {
		List<Cart> list=new ArrayList<Cart>();
		try{
			Session session=this.sessionFactory.openSession();
			list=session.createQuery(hql).list();
			session.clear();
			session.close();
		}catch(Exception e){
			System.err.print(e);
		}
		return list;
	}

	@Override
	public boolean addCart(Cart cart) {
		boolean isSuccess=false;
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(cart);
		transaction.commit();
		session.clear();
		session.close();
		return true;
	}

	@Override
	public boolean delCart(List<Cart> list) {
		// TODO Auto-generated method stub
		boolean isSuccess=false;
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		for (Cart cart : list)
			session.delete(cart);
		transaction.commit();
		session.clear();
		session.close();
		return true;
	}

	@Override
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		boolean isSuccess=false;
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(cart);
		transaction.commit();
		session.clear();
		session.close();

		return true;
	}

}
