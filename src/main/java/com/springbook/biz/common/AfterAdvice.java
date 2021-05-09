package com.springbook.biz.common;

public class AfterAdvice {
	public void finallyLog() {
		System.out.println("비즈니스 로직 수행후 무조건 동작");
	}
}
