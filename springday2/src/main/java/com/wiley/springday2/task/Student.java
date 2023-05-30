package com.wiley.springday2.task;

import java.util.*;

public class Student {
	private int studentId;
	private String studentName;
	private Properties props;
	private Set mobile;
	private List address;
	private Map courses;

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set getMobile() {
		return mobile;
	}

	public void setMobile(Set mobile) {
		this.mobile = mobile;
	}

	public List getAddress() {
		return address;
	}

	public void setAddress(List address) {
		this.address = address;
	}

	public Map getCourses() {
		return courses;
	}

	public void setCourses(Map courses) {
		this.courses = courses;
	}

	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", props=" + props + ", mobile="
				+ mobile + ", address=" + address + ", courses=" + courses + "]";
	}

	public Student(int studentId, String studentName, Properties props, Set mobile, List address, Map courses) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.props = props;
		this.mobile = mobile;
		this.address = address;
		this.courses = courses;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
public Set getPhones() {
	return mobile;
}

}
