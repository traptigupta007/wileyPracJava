package com.wiley.spring_core.cl;public class Cert {
	
	 String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cert(String name) {
		super();
		this.name = name;
	}

	public Cert() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cert [name=" + name + "]";
	}
	

}