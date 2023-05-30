package com.wiley.springday2.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("trapti")
private String studentname;
	@Value("Moradabad")
private String city;
	@Value("#{mycities}")
	private List<String> cities;
public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [studentname=" + studentname + ", city=" + city + ", cities=" + cities + "]";
}


}
