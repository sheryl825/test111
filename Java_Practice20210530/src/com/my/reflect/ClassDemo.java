package com.my.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
	
		Constructor<?> constructor1 = ReflectDemo.class.getDeclaredConstructor();
		Object inst1 = constructor1.newInstance();		
		System.out.println(inst1);

	}
	
}
