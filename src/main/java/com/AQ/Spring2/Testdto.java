package com.AQ.Spring2;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.AQ.Spring2.DTO.Test;

public class Testdto {
	public static void main(String[] args) {
		
		//Resource resource  = new ClassPathResource(""); 
		//BeanFactory     factory = new XmlBeanFactory(resource);
		
		
		
		ApplicationContext   context  =  new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		 Test  test = (Test) context.getBean("test");
		 System.out.println(test.getId());
		 System.out.println(test.getName());
		 System.out.println(test.getAddress());
		 System.out.println(test.getEmail());
	
		 
     
		 
		 Test  details = (Test) context.getBean("detail");
		 System.out.println( details.getId());
		 System.out.println( details.getName());
		 System.out.println( details.getAddress());
		 System.out.println( details.getEmail());
		 

		 Test  test3 = (Test) context.getBean("test3");
		 System.out.println(test3.getId());
		 System.out.println(test3.getName());
		 System.out.println(test3.getAddress());
		 System.out.println(test3.getEmail());
		 
		}

}
