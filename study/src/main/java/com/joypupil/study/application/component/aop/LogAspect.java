package com.joypupil.study.application.component.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.joypupil.study.application.component.log.Logger;

@Component
@Aspect
public class LogAspect {
	
	@Before("execution(* com.joypupil.study.application.*.*(..))")
	public void logStart(JoinPoint jp){
		System.out.println(jp.getTarget());
		System.out.println(jp.getSignature().getName());
		Logger.info("加入日志");
	}
	
	@After("execution(* com.joypupil.study.application.*.*(..))")
	public void logEnd(JoinPoint jp){
		Logger.info("结束加入日志");
	}
	
	@Around("execution(* com.joypupil.study.application.*.*(..))")
	public void logAround(ProceedingJoinPoint pjp) throws Throwable{
		Logger.info("开始Around");
		pjp.proceed();
		Logger.info("结束Around");
	}

}
