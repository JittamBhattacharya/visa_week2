package com.visa.prj.client;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {

	@Test
	public void testAddTime() {
		Time t1 = new Time(4,30);
		Time t2 = new Time(3,45);
		
		Time t3 = Time.addTime(t1 , t2);
		
		assertEquals(8,t3.getHours());
		assertEquals(15,t3.getMin());
				
	}

	@Test
	public void testAddTim() {
		

		Time t1 = new Time(4,30);
		Time t2 = new Time(3,45);
		Time t3 = t1.addTim(t2);
		
		assertEquals(8,t3.getHours());
		assertEquals(15,t3.getMin());
		
	}

}
