package com.springbook.biz.common;

public class AfterReturningAdvice {
	public void afterLog() {
		System.out.println("비즈니스 로직 수행후 동작");
	}
}
