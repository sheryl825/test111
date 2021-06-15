package com.my.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException,  InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException , Exception{
		//Class<?> tag = Class.forName("com.my.annotation.TestTag");
		//Method method = tag.getDeclaredMethod("logout");
		//MyTag mytag = method.getAnnotation(MyTag.class);
		//System.out.println("注解的名称是："+mytag.name());
		//System.out.println(mytag);
		
		Class<?> class1 = Class.forName("com.my.annotation.TestTag");
		Constructor constructor1 = class1.getConstructor();
		Object obj = constructor1.newInstance();
		
		Method[] methods = class1.getMethods();
		for(Method mt: methods) {
			if(mt.getAnnotations()!=null & mt.getParameterCount()==0) {
				mt.invoke(obj);
				System.out.println("测试用例的名称是：" + mt.getName());
			}
		}
		

	}

}
