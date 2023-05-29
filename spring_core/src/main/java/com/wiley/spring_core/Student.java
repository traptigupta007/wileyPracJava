package com.wiley.spring_core;

import java.util.*;

public class Student {
	private int studentId;
	private String studentName;
	private Properties props;
	private Set mobile;
	private List address;
	private Map skills;

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

	public Map getSkills() {
		return skills;
	}

	public void setSkills(Map skills) {
		this.skills = skills;
	}

	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", props=" + props + ", mobile="
				+ mobile + ", address=" + address + ", skills=" + skills + "]";
	}

	public Student(int studentId, String studentName, Properties props, Set mobile, List address, Map skills) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.props = props;
		this.mobile = mobile;
		this.address = address;
		this.skills = skills;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
