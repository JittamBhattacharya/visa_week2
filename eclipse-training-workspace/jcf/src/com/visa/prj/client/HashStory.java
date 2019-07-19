package com.visa.prj.client;

import com.visa.prj.entity.Product;

public class HashStory {

	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		String s4 = new String("Hello");
		String s2 = new String("Aa");
		String s3 = new String("Bb");
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		new Product(645,"Hp Laptop",135000.00,"computer",100);
	}

}
