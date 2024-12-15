package com.spring.standalone;

import java.util.List;

public class Person {

	private List<String> friend;

	public List<String> getFriend() {
		return friend;
	}

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "Person [friend=" + friend + "]";
	}
  
}
