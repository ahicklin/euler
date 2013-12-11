package com.ashley.euler;

public class Problem9 {

	public static void main(String[] args) {
		int a, b, c;

		for (a = 0; a < 1000; a++)
			for (b = a + 1; b < 1000; b++)
			{
				for (c = b + 1; c < 1000; c++) {
					if ((a + b + c) == 1000
							&& Math.pow(a, 2) + Math.pow(b, 2) == Math
									.pow(c, 2)) {
						System.out.printf("%d", a * b * c);
					}
				}
			}
		}
	}
