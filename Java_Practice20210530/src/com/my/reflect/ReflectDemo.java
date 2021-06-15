package com.my.reflect;

public class ReflectDemo {
	ReflectDemo(){
		System.out.println("默认无参构造函数");
	}
	ReflectDemo(String p_para){
		System.out.println("有参构造函数");
	}
	
	public String myPara1="public属性";
	protected String myPara2="protected属性";
	private String myPara3="private属性";
	
	public void test1() {
		System.out.println("这是public void无参方法test1");
	}
	
	protected String test2(String p_test2) {
		System.out.println("这是protected void有参方法test2");
		return p_test2;
	}
	
	private String test3(String p_test3) {
		System.out.println("这是private 无参方法test3");
		return p_test3;
	}
	
	public void test4() {
		System.out.println("这是public void无参方法test4");
	}
}
