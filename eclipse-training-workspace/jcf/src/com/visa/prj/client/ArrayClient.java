package com.visa.prj.client;

import java.util.Arrays;

public class ArrayClient {

	public static void main(String[] args) {
		
		String[] names = {"Calvin" , "George" , "Lee" , "Angelina" , "Brad"};
		
		Arrays.sort(names);
		
		for (String name : names) {
			System.out.println(name);
		}
	
		Arrays.sort(names , (o1 , o2) -> o1.length() - o2.length());
		/*
		 * Arrays.sort(names , new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1 , String o2) { return o2.length() -
		 * o1.length(); } });
		 */
		
		for (String name : names) {
			System.out.println(name);
		}
	
		
		
	}

}
