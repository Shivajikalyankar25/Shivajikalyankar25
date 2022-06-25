package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		/*Resource res=new ClassPathResource("spring.xml");
		BeanFactory be=new XmlBeanFactory(res);*/
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		SetterInjection si=(SetterInjection) ap.getBean("s");
		System.out.println(si);
	}

}
