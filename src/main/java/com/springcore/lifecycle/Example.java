package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("ending nmethod");
	}
	
	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}


}
