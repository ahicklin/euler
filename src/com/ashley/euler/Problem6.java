package com.ashley.euler;

public class Problem6 {

	public static void main(String[] arges) {
		int total = 0; 
		
		int sum = 0;
		int squ = 0;
	
		for(int i = 1; i <= 100; i++) {
			
			total += (i * i);
			
			sum += i;
			squ = (sum * sum) - total;
		}
	
		System.out.println();
		}
	}

