package com.visa.prj.entity;

import com.visa.prj.client.Time;

public class TimeClient {
	
	public static void main(String[] args) {
		Time t1 = new Time(4,30);
		Time t2 = new Time(3,45);
		
		Time t3 = Time.addTime(t1 , t2);
		
		System.out.println(t1.getHours() + ":" + t1.getMin());
		System.out.println(t2.getHours() + ":" + t2.getMin());
		System.out.println(t3.getHours() + ":" + t3.getMin());
		
			
		Time t4 = t1.addTim(t2);
		
		System.out.println(t1.getHours() + ":" + t1.getMin());
		System.out.println(t2.getHours() + ":" + t2.getMin());
		System.out.println(t4.getHours() + ":" + t4.getMin());
	}

}
