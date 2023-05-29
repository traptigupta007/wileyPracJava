package com.wiley.spring_core.cl;

public class Person {
	 String name;
	 int id;
	
	 Cert cert;
	@Override
	public String toString() {
		return  name + " " + id + " " + this.cert.name;
	}
	
	public Person(String name, int id,Cert cert) {
		super();
		this.name = name;
		this.id = id;
		this.cert=cert;
	}
	
}
