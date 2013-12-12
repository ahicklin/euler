package com.ashley.euler;

public class Problem10 {

	public static void main(String args[]) {

		Problem10 probObj = new Problem10();

		long sum = 0;
		int num = 1;
		while (num < 2000000) {
			if (probObj.isPrime(num)) {
				sum += num;
			} 
				num += 2;
				}
				System.out.println(sum + 2); 
				} 
	public  boolean isPrime(int n) { if (n == 1){ 
		return false; 
		} 
		int number = (int) Math.sqrt(n); 
		for (int i = 2; i <= number; i++) { 
			if (n % i == 0)
			 return false; 
			} 
		return true;
		}
	}
