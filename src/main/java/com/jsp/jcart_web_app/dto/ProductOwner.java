package com.jsp.jcart_web_app.dto;

public class ProductOwner {
	private int Id;
	private String Name;
	private String Email;
	private String Password;
	private long Phone;
	public ProductOwner(int id, String name, String email, String password, long phone) {
		super();
		Id = id;
		Name = name;
		Email = email;
		Password = password;
		Phone = phone;
	}
	public ProductOwner() {
		super();
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public ProductOwner(String name, String email, String password, long phone) {
		super();
		Name = name;
		Email = email;
		Password = password;
		Phone = phone;
	}
	
	
	

	
}
