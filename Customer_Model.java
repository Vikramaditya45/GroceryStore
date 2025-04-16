package com.project_Main.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer_Model 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Username;
	private String email;
	private String phone;
	private String password;
	private String cpassword;
	
	public Customer_Model(int id, String Username, String email, String phone, String password, String cpassword) 
	{
		super();
		this.id = id;
		this.Username = Username;
		this.email=email;
		this.phone=phone;
		this.password = password;
		this.cpassword=cpassword;
	}
	
	public Customer_Model() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getUsername() 
	{
		return Username;
	}
	public void setUsername(String Username) 
	{
		this.Username = Username;
	}
	
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone=phone;
	}
	
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getCpassword()
	{
		return cpassword;
	}
	public void setCpassword(String cpassword)
	{
		this.cpassword=cpassword;
	}

	@Override
	public String toString() 
	{
		return "Customer_Model [id=" + id + ", Username=" + Username + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + ", cpassword=" + cpassword + "]";
	}
}