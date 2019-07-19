package com.visa.prj.client;
public class Time {
	
	private int hours;
	private int minutes;
	
	public Time(int hours , int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public int getHours() {
		return hours;
	}
	
	public int getMin() {
		return minutes;
	}
	public static Time addTime(Time t1 , Time t2) {
		Time temp = new Time(0,0);
		temp.minutes = (t1.minutes + t2.minutes)%60;
		temp.hours =( (t1.hours + t2.hours) + (t1.minutes + t2.minutes)/60)%24;
		return temp;
	}
	
	public  Time addTim(Time t2) {
		
		Time temp = new Time(0,0);
		temp.minutes = (this.minutes + t2.minutes)%60;
		temp.hours =( (this.hours + t2.hours) + (this.minutes + t2.minutes)/60)%24;
		return temp;
	}
}
