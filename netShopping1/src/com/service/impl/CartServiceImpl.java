package com.service.impl;

import java.util.List;

import com.dao.CartDao;
import com.opensymphony.xwork2.ActionContext;
import com.po.Cart;
import com.service.CartService;

public class CartServiceImpl implements CartService {
	private CartDao cartDao;

	public CartDao getCartDao() {
		return cartDao;
	}

	public void setCartDao(CartDao cartDao) {
		this.cartDao = cartDao;
	}

	@Override
	public List<Cart> getCartByUserName(String userName) {
		// TODO Auto-generated method stub
		String hql="select new Cart(c.id,p.id,p.name,p.price,c.count,p.price*c.count) from Cart c, Product p where c.productid=p.id and c.userName='"+userName+"'";
		List<Cart> list=this.cartDao.getData(hql);
		return list;
	}

	@Override
	public boolean addItemToCart(Cart cart) {
		// TODO Auto-generated method stub
		String userName=(String) ActionContext.getContext().getSession().get("userName");
		String hql = "from Cart where username = '"+ userName +"' and productid = "+cart.getProductid().intValue();
		System.out.println(hql);
		List<Cart> list = cartDao.getData(hql);
		if (list.size() == 0) {
			cartDao.addCart(cart);
		} else {
			cart = list.get(0);
			cart.setCount(cart.getCount() + 1);
			cartDao.updateCart(cart);
		}

		return true;
	}

	@Override
	public boolean updateItemOnCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteItemFromCart(Cart cart) {
		// TODO Auto-generated method stub
		String userName=(String) ActionContext.getContext().getSession().get("userName");
		String hql = "from Cart where username = '"+ userName +"'";
		List<Cart> list = cartDao.getData(hql);
		cartDao.delCart(list);
		return true;
	}

}
