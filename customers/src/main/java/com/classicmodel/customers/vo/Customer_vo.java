package com.classicmodel.customers.vo;

public class Customer_vo extends Base_vo{

	
	private static final long serialVersionUID = -6162751299840513983L;

	private int customer_number;
	private String customer_name;
	private String contact_lastName;
	private String contact_firstName;
	private String phone_no;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private String pincode;
	private String country;
	private int sales_representative_no;
	private double credit_limit;
	public int getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(int customer_number) {
		this.customer_number = customer_number;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getContact_lastName() {
		return contact_lastName;
	}
	public void setContact_lastName(String contact_lastName) {
		this.contact_lastName = contact_lastName;
	}
	public String getContact_firstName() {
		return contact_firstName;
	}
	public void setContact_firstName(String contact_firstName) {
		this.contact_firstName = contact_firstName;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getAddress_line1() {
		return address_line1;
	}
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}
	public String getAddress_line2() {
		return address_line2;
	}
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSales_representative_no() {
		return sales_representative_no;
	}
	public void setSales_representative_no(int sales_representative_no) {
		this.sales_representative_no = sales_representative_no;
	}
	public double getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(double credit_limit) {
		this.credit_limit = credit_limit;
	}
	
	
	
	
}
