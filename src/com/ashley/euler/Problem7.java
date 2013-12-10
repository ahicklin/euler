package com.ashley.euler;

public class Problem7 {

		static boolean isPrime(int n) {
	    if (n == 2) return true;
	    if (n % 2 == 0 || n == 1) return false;
	    long max = (long)Math.sqrt(n);
	    for (int i = 3; i <= max; i += 2)
	        if (n % i == 0) return false;
	    return true;
	    }
	
	 public static void main(String[] args) {
	        int count = 0;
	        int prime = 0;
	        while (prime <= 10001) {
	            if (isPrime(count) == true) {
	                prime++;
	                if (prime == 10001) {
	                    System.out.println(count);
	                }
	            }
	            count++;
	        }
	    }
	}
