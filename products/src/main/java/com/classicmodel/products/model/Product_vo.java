package com.classicmodel.products.model;

public class Product_vo extends Base_vo{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3092597473477596012L;

	private String product_code;
	private String product_name; 
	private String product_line;
	private String product_scale;
	private String product_vendor;
	private String product_description;
	private int quantity_in_stock;
	private double buy_price;
	private double MSRP;
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_line() {
		return product_line;
	}
	public void setProduct_line(String product_line) {
		this.product_line = product_line;
	}
	public String getProduct_scale() {
		return product_scale;
	}
	public void setProduct_scale(String product_scale) {
		this.product_scale = product_scale;
	}
	public String getProduct_vendor() {
		return product_vendor;
	}
	public void setProduct_vendor(String product_vendor) {
		this.product_vendor = product_vendor;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public int getQuantity_in_stock() {
		return quantity_in_stock;
	}
	public void setQuantity_in_stock(int quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}
	public double getBuy_price() {
		return buy_price;
	}
	public void setBuy_price(double buy_price) {
		this.buy_price = buy_price;
	}
	public double getMSRP() {
		return MSRP;
	}
	public void setMSRP(double mSRP) {
		MSRP = mSRP;
	}
	
}
