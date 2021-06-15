package com.my.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		//String classname = "com.my.reflect.ReflectDemo";
		//Class<?> class1 = Class.forName(classname);
		//Class<?> class2 = ReflectDemo.class;
		//Method[] method2 = class2.getDeclaredMethods();
		
		//for(int i=0; i<method2.length; i++) {
			//System.out.println(method2[i].toString());
		//}
		
		Class<?> class3 = Class.forName("com.my.reflect.ReflectDemo");
		
		Constructor<?> constructor3 = class3.getDeclaredConstructor();
		Object object3 = constructor3.newInstance();
		
		//Method method3 = class3.getDeclaredMethod("test2", String.class);
		//String str = (String)method3.invoke(object3, "Hello 6.1");
		//System.out.println(str);
		
		Method method4 = class3.getDeclaredMethod("test3", String.class);
		method4.setAccessible(true);
		method4.invoke(object3, "hello 6.2");
		
	}

}
