package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		
		    Person person1=con.getBean("person2",Person.class);
		    System.out.println(person1);
		    System.out.println(person1.getHobbies().getClass().getName());
		    System.out.println("__________________________");
		    System.out.println(person1.getFeestructure());
		    System.out.println(person1.getFeestructure().getClass().getName());
		    System.out.println("___________________");
		    System.out.println(person1.getProperties());
	}

}
  