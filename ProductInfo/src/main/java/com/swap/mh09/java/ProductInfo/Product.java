package com.swap.mh09.java.ProductInfo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Pro_Info")
public class Product
{
	@Id
	private int Pid;
	private String name ;
	private double price ;
	
	
	public int getPid() 
	{
		return Pid;
	}
	public void setPid(int pid) 
	{
		Pid = pid;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", name=" + name + ", price=" + price + "]";
	}
	public Product(int pid, String name, double price) {
		super();
		Pid = pid;
		this.name = name;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}
	
	

