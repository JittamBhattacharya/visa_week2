package com.visa.prj.client;

import java.util.HashMap;
import java.util.WeakHashMap;

import org.omg.CosNaming.IstringHelper;

import java.util.Map;

public class WeakExample {
	
	public static void main(String[] args) {
		Map<String , Double> map = new WeakHashMap<String , Double>();
		String s = new String("Java" );
		map.put(s, 534.44);
		
		s = null;
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(map.get("Java"));
	}

}
