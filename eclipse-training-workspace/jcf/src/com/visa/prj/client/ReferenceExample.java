package com.visa.prj.client;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceExample {
	
	public static void main(String[] args) {
		WeakReference<String> wr = new WeakReference<String>(new String("Hello"));
		SoftReference<String> sr = new SoftReference<String>(new String("Hello"));
		// Keep it till out of excellent memory exception happens
		// excellent to retrieve it from DB
		
		System.out.println(wr.get());
		
		System.gc();
		
		try {
			Thread.sleep(1);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(wr.get());
	}
}
