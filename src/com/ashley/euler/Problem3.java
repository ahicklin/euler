package com.ashley.euler;


public class Problem3 {
	
	  public static void main(String[] args) {

		    long number = 600851475143L;

		    long highestPrime = -1;
		    for (long i = 2; i <= number; ++i) {
		        if (number % i == 0) {
		            highestPrime = i;
		            number /= i;
		            --i;
		        }
		    }

		    System.out.println(highestPrime);
		} 
}
    	