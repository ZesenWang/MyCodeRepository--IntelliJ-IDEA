package com.dao;

import java.util.List;

import com.po.Product;

public interface ProductDao {
	List<Product> getData(String hql);
	boolean addProduct(Product product);
	boolean updateProduct(Product product);
	boolean delProduct(Product product);
}
