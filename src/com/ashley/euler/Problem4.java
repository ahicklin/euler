package com.ashley.euler;

import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {

	public static void main(String[] arges) {
		
		int num = 0;
		
		for(int i = 100; i <= 999; i++) {
			
			for(int n = i; n <= 999; n++) {
				
				int val1 = i * n;
				StringBuilder sb1 = new StringBuilder(""+val1);
				String sb2 = ""+val1;
				sb1.reverse();
				
				if(sb2.equals(sb1.toString()) && num<val1) {
				num = val1;
				
				}
			}
		}
		System.out.println(num);
	}
}
