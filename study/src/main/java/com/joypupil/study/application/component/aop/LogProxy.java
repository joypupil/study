package com.joypupil.study.application.component.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.joypupil.study.application.component.log.Logger;

/**
 * 
 * @author hezikang
 *
 */
public class LogProxy implements InvocationHandler{
	
	private LogProxy(){}
	
	private Object target;
	
	public static Object getInstace(Object o){
		LogProxy proxy = new LogProxy();
		proxy.target = o;
		Object result = Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), proxy);
		return result;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Logger.info("进行了相应的操作");
		Object obj = method.invoke(target, args);
		return obj;
	}

}
