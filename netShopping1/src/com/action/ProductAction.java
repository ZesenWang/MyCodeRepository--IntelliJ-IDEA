package com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.po.Product;
import com.service.ProductService;

public class ProductAction {
	private String id;
	private ProductService productService;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	public String showAllProduct(){
		List<Product> list=this.productService.getAllProduct();
		ActionContext.getContext().put("allProduct", list);
		return "showAllProduct";
	}
	
	public String showProductByID(){
		Product product=this.productService.getProductByID(id);
		ActionContext.getContext().put("product", product);
		return "showProductByID";
	}
}
