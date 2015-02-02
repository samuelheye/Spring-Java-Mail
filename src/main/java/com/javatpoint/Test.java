package com.javatpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MailMail m = (MailMail) context.getBean("mailMail");
		String sender = "sambagurd@gmail.com";// write here sender gmail id
		String receiver = "gizagashaw@gmail.com";// write here receiver id
		m.sendMail(sender, receiver, "hi2", "welcome");

		System.out.println("success");
	}
}