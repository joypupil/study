package com.joypupil.study.designpattern.factory.lazyinit;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
	
	private static final Map<String, Product> prMap = new HashMap();
	
	public static synchronized Product createProduct(String type){
		Product product = null;
		//如果map中已经有这个对象
		if(prMap.containsKey(type)){
			product = prMap.get(type);
		} else{
			if(type.equals("Product1")){
				product = new ConcreteProduct1();
			}else{
				product = new ConcreteProduct2();
			}
			//同时把对象放到缓存容器中
			prMap.put(type, product);
		}
		return product;
	}

}