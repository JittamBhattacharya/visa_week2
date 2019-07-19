package com.visa.prj.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.visa.prj.entity.Product;

import java.lang.reflect.Method;


public class ProductClientNew {
	
	public static void main(String[] args) {
		
		
		List<Product> products = new ArrayList<>();
		products.add(new Product(645,"Hp Laptop",135000.00,"computer",100));
		products.add(new Product(224,"iPhone",98000.00,"mobile",500));
		products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
		products.add(new Product(5,"Sony Bravia",125000.00,"tv",900));
		products.add(new Product(912,"One Plus",32000.00,"mobile",100));
		products.add(new Product(88,"HP Printer",19000.00,"computer",100));	 
		
		for (Product p : products) {
			Map <String , Object> info = storeInfo(p);
			System.out.println(info);
		}
		
		
		
	}
	
	static Map<String ,Object> storeInfo(Object o) {
		
			Map<String,Object> map = new HashMap<String , Object>();
			Class<?> clazz = o.getClass();
			Method[] methods = clazz.getMethods();
			for(Method m : methods) {
				if(m.getName().startsWith("get")) {
					try {
						Object ret = m.invoke(o);
						System.out.println(m.getName().substring(3) + ":" + ret);
						map.put(m.getName().substring(3) ,  ret);
					} catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			}
			System.out.println("*******");
	
			return map;
	}
		
}
	
		
		





