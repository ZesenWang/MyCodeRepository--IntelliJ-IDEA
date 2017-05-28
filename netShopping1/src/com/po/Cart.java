package com.po;

public class Cart {
	private Integer id;
	private Integer productid;
	private Integer count;
	private String userName;

	private String name;
	private Float price;
	private Float sum;
	
	public Cart(){
		
	}

	public Cart(Integer id, Integer productid, String name, Float price,
			Integer count, Float sum) {
		super();
		this.id = id;
		this.productid = productid;
		this.name = name;
		this.price = price;
		this.count = count;
		this.sum = sum;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}



	public Float getSum() {
		return sum;
	}



	public void setSum(Float sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Cart{" +
				"id=" + id +
				", productid=" + productid +
				", count=" + count +
				", userName='" + userName + '\'' +
				", name='" + name + '\'' +
				", price=" + price +
				", sum=" + sum +
				'}';
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
