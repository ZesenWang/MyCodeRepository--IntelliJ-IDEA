package com.service;

import java.util.List;

import com.po.Product;

public interface ProductService {
	public List<Product> getAllProduct();
	public Product getProductByID(String id);
}
