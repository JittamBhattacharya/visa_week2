package com.visa.prj.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSecond {

	public static void main(String[] args) {
		
		List<Integer> il =  Arrays.asList(1,66,3,77,2);
		List<String> sl = Arrays.asList("one" , "two" , "three");
		
		print(il);
		print(sl);
		
		List<Integer> copyInt = new ArrayList<>();
		List<String> copyStr = new ArrayList<>();
		
		copy(copyInt , il);
		copy(copyStr , sl);
		
		System.out.println(copyInt);
		System.out.println(copyStr);
		
		copy2(copyInt , il);
		copy2(copyStr , sl);
		
		System.out.println(copyInt);
		System.out.println(copyStr);
 		
	}

	private static <T >void copy(List<T> dest, List<T> src) {
		for (T o : src) {
			dest.add(o);
		}
	}
	
	// PECS producer extends consumer super
	// SEDS source extends destination super
	private static <T >void copy2(List<? super T> dest, List<? extends T> src) {
		for (T o : src) {
			dest.add(o);
		}
	}
			
	

	private static void print(List<?> list) {
		
		for(Object i: list) {
			System.out.println(i);
		}
	}

}
