package com.my.reflect;

public class ReflectDemo {
	ReflectDemo(){
		System.out.println("Ĭ���޲ι��캯��");
	}
	ReflectDemo(String p_para){
		System.out.println("�вι��캯��");
	}
	
	public String myPara1="public����";
	protected String myPara2="protected����";
	private String myPara3="private����";
	
	public void test1() {
		System.out.println("����public void�޲η���test1");
	}
	
	protected String test2(String p_test2) {
		System.out.println("����protected void�вη���test2");
		return p_test2;
	}
	
	private String test3(String p_test3) {
		System.out.println("����private �޲η���test3");
		return p_test3;
	}
	
	public void test4() {
		System.out.println("����public void�޲η���test4");
	}
}
