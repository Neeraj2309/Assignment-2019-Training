package com.infy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	@After("execution(* com.infy.*.*.*(..))")
	public void loggerAfterAdvice(JoinPoint join) {
		System.out.println("Inside Logger method...");
	}
}
