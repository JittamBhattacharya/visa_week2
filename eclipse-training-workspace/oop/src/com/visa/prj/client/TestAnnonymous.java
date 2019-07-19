package com.visa.prj.client;

@FunctionalInterface	// has only one method has to be implemented
interface Computation{
	int compute(int x, int y);
}


public class TestAnnonymous {

	public static void main(String[] args) {
		Computation c1 = new Computation() {
			@Override
			public int compute(int x , int y) {
				return x + y;
			};
		};	
	}
	
	/*
	 * Java 8 introduced Lambda Expression 
	 * as a shorter form for Annonymous class
	 * 
	 * Limitations : interface should have only one method to implement
	 * 
	 */
	
	Computation c2 = (int x, int y) -> {
		return x - y ;
		
	};
	

}
