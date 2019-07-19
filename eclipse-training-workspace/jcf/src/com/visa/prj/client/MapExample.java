package com.visa.prj.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.visa.prj.entity.Product;

public class MapExample {

	public static void main(String[] args) {
		
		Map <String , Double> map = new HashMap<>();
		map.put("Java", 533.44);
		map.put("Oracle", 6334.44);
		map.put("JavaScript" , 522.33);
		map.put("Java", 299.44); 	// overrides the abpve
		
		
		System.out.println(map.get("Java"));
		
		Set<String> keys = map.keySet();
		
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		List<Product> products = new ArrayList<>();
		products.add(new Product(645,"Hp Laptop",135000.00,"computer",100));
		products.add(new Product(224,"iPhone",98000.00,"mobile",500));
		products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
		products.add(new Product(5,"Sony Bravia",125000.00,"tv",900));
		products.add(new Product(912,"One Plus",32000.00,"mobile",100));
		products.add(new Product(88,"HP Printer",19000.00,"computer",100));	 
		
		Map<String , List<Product>> map2 = 
				products.stream().collect(Collectors.groupingBy(p -> p.getCategory()));
//		
//		map.forEach((k,v)-> {
//			System.out.println(k);
//			v.forEach(System.out::println);
//		});
		
		System.out.println("**********");
		
		keys.forEach(System.out::println);
		
		map.forEach((k,v)-> System.out.println(k +":" + v));;
		
		
		
	}

}
