package com.my.annotation;

public class TestTag {
	@MyTag(name="case1")
	public void login() {
		System.out.println("login");
	}
	
	@MyTag(name="case2")
	public void info() {
		System.out.println("info");
	}
	
	@MyTag(name="case3")
	public void logout() {
		System.out.println("logout");
	}
	
	@MyTag(name="case4")
	public void test(String p) {
		System.out.println("logout with para");
	}

}
