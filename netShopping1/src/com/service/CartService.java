package com.service;

import java.util.List;

import com.po.Cart;

public interface CartService {
	public List<Cart> getCartByUserName(String userName);
	public boolean addItemToCart(Cart cart);
	public boolean updateItemOnCart(Cart cart);
	public boolean deleteItemFromCart(Cart cart);
}
