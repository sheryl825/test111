package com.my.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectJunit {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException  {
		Class<?> class1 = Class.forName("com.my.reflect.ReflectDemo");
		Method[] method1 = class1.getMethods();
		
		for(int i=0; i<method1.length; i++) {
			if(method1[i].getName().startsWith("test")) {
				System.out.println(method1[i].getName());
				method1[i].invoke(class1.newInstance());
			}
		}

	}

}
