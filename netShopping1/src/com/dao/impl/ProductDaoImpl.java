package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.ProductDao;
import com.po.Product;

public class ProductDaoImpl implements ProductDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Product> getData(String hql) {
		// TODO Auto-generated method stub
		List<Product> list=new ArrayList<Product>();
		
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
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

}
