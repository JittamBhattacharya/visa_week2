package com.visa.prj.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.visa.prj.entity.Product;

public class SetExample {
	
	public static void main(String[] args) {
		
		String str = "we are the world we are the children" ;
		
		List<String> items = Arrays.asList(str.split("\\s"));
		System.out.println(items);
		Set <String> itemSet = new HashSet<String>(items);
		System.out.println(itemSet);
		List<String> itemSetList = new ArrayList<String>();
		itemSetList.addAll(itemSet);
		List<String> items2 = new ArrayList<String>();
		items2.addAll(items);
		System.out.println("***************");
		System.out.println(items2);
		System.out.println(itemSetList);
		System.out.println("**************");
		System.out.println("##############");
		System.out.println(items2);
		System.out.println(itemSetList);
		System.out.println("#############");
		Set <String> totalSet = new HashSet<String>();
		Set <String> uniqueSet = new HashSet<String>();
		Set <String> duplicateSet = new HashSet<String>();
		
		
		for (String s : items) {
			if(totalSet.add(s)) {
				uniqueSet.add(s);
			}
			else{
				duplicateSet.add(s);
			}
			
		}
		
		uniqueSet.removeAll(duplicateSet);
		System.out.println(uniqueSet);
		System.out.println(duplicateSet);
		
		
//		Set<Product> products = new HashSet<>(500);
//		Set<Product> products = new TreeSet<>();
		
		Set<Product> products = new TreeSet<>((p1 , p2) -> {
			int diff = Double.compare(p1.getPrice(), p2.getPrice());
			if(diff == 0) {
				diff = p1.getId() - p2.getId();
			}
			return diff;
			
		});
		
		products.add(new Product(645,"Hp Laptop",135000.00,"computer",100));
		products.add(new Product(224,"iPhone",98000.00,"mobile",500));
		products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
		products.add(new Product(5,"Sony Bravia",125000.00,"tv",900));
		products.add(new Product(912,"One Plus",32000.00,"mobile",100));
		products.add(new Product(88,"HP Printer",19000.00,"computer",100));	 
		products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
		
		for (Product p : products) {
			System.out.println(p);
		}
	}
	

}
