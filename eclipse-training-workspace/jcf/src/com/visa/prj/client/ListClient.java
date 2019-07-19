package com.visa.prj.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.visa.prj.entity.Product;

public class ListClient {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(645,"Hp Laptop",135000.00,"computer",100));
		products.add(new Product(224,"iPhone",98000.00,"mobile",500));
		products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
		products.add(new Product(5,"Sony Bravia",125000.00,"tv",900));
		products.add(new Product(912,"One Plus",32000.00,"mobile",100));
		products.add(new Product(88,"HP Printer",19000.00,"computer",100));	 
		
		Collections.sort(products , (o1 , o2) ->  (int)o1.getPrice() - (int)o2.getPrice());
		Collections.sort(products , (o1 , o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
		for (Product p : products) {
			System.out.println(p);
		}
		
		//	Avoid this
		
		for(int i = 0; i < products.size() ; i++) {
			Product p = products.get(i);
			System.out.println(p);
			//products.add(new Product()); // Fails with an infinite loop
			
		}
		
		System.out.println("**************");
		
		Iterator<Product> iter = products.iterator();
		products.add(new Product()); //Fails Fast Raise an ConcurrentModification Error
		
		while(iter.hasNext()) {
			Product p = iter.next();
			System.out.println(p);
		}
		
		
		System.out.println("*************");
		
		for (Product p : products) {
			//products.add(new Product()); //Fails Fast Raise an ConcurrentModification Error
			System.out.println(p);
		}
		
	
	}

}
