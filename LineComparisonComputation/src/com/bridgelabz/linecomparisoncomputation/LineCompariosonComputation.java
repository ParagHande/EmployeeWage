package com.bridgelabz.linecomparisoncomputation;

public class LineCompariosonComputation {

	public static void main(String[] args) {

		double x1 = 5;  double y1 = 5;
		double x2 = 10; double y2 = 10;
		double x = (x2-x1)*(x2-x1);
		double y = (y2-y1)*(y2-y1);
		double z = x + y;

		double t;  
		double sqrtroot= z/2;  
		
		do{  
			t=sqrtroot;  
			sqrtroot=(t+(z/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		
		System.out.println("Length Beetween Two Points= "+ sqrtroot);
		
	}
}
