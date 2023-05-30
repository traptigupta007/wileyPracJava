package com.wiley.springday2.task;

import java.util.HashMap;
import java.util.List;

public class Person {
	private List<String> friends;
	private HashMap<String,String> courses;
	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public HashMap<String, String> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courses=" + courses + "]";
	}

	public void setCourses(HashMap<String, String> courses) {
		this.courses = courses;
	}
	
}
