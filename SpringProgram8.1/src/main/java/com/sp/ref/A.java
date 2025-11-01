package com.sp.ref;

public class A {
	
	private String name;
	private B ob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", ob=" + ob + "]";
	}
	
	

}
