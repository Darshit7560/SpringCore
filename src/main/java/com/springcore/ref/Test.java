package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a=(A)context.getBean("aref");
		System.out.println(a.getX());// from class a object we can get a.getX()
		System.out.println(a.getOb().getY());  //from class a to get object of class b and from the object of b we can get value of y
		System.out.println(a);
		
	}

}
