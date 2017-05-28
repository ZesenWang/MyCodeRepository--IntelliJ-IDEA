package com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.po.Cart;
import com.service.CartService;

public class CartAction {
	private static final Integer UNKNOWN = 1;
	private CartService cartService;
	private Integer id;
	private String name;
	private Float price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CartService getCartService() {
		return cartService;
	}

	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	
	public String showCartByUserName(){
		String userName=(String)ActionContext.getContext().getSession().get("userName");
		if(userName==null){
			return "login";
		}
		List<Cart> list=this.cartService.getCartByUserName(userName);
		ActionContext.getContext().put("cart", list);
		return "showCartSuccess";
	}
	public String addItemToCart(){
		String userName=(String)ActionContext.getContext().getSession().get("userName");
		if(userName==null){
			return "login";
		}
		Cart cart = new Cart(UNKNOWN, id, name, price, 1, price);
		cart.setUserName(userName);

		System.out.println(cart.toString());
		this.cartService.addItemToCart(cart);

		List<Cart> list=this.cartService.getCartByUserName(userName);
		ActionContext.getContext().put("cart", list);

		return "showCartSuccess";
	}
	public String deleteItemFromCart(){
		cartService.deleteItemFromCart(null);
		return "success";
	}
	public String updateItemOnCart(){
		return "showCartSuccess";
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
}
