package com.my.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FieldDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, NoSuchFieldException {
		ReflectDemo rd = new ReflectDemo();
		Class<?> class1 = rd.getClass();
		Field f;
		f = class1.getDeclaredField("myPara3");
		f.setAccessible(true);
		System.out.println(f.get(rd));
		f.set(rd, "ÐÂµÄprivateÊôÐÔ");
		System.out.println(f.get(rd));

	}

}
