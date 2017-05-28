package com.service.impl;

import java.util.List;

import com.dao.ProductDao;
import com.po.Product;
import com.service.ProductService;

public class ProductServiceImpl implements ProductService {
	//接收ProductDao对象的注入
	public ProductDao productDao;
	
	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		String hql="from Product";
		List<Product> list=this.productDao.getData(hql);
		return list;
	}

	@Override
	public Product getProductByID(String id) {
		// TODO Auto-generated method stub
		String hql="from Product where id=" + id;
		List<Product> list=this.productDao.getData(hql);
		return list.get(0);
	}

}
