package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundLog(ProceedingJoinPoint pjp)throws Throwable {
		System.out.println("비즈니스 메소드  수행전 처리 할 내용");
		Object returnObj = pjp.proceed();
		System.out.println("비즈니스 메소드 수행 후 처리 할 내용");
		return returnObj;
	}
}
