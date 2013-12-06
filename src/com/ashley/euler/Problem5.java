package com.ashley.euler;

public class Problem5 {
	
	public static void main(String[] arges) {
		
		boolean complete = false;
		int count = 0;
		int div = 1;
		
		do {
			count++; 
			for(div = 1; div <= 20; div ++)
			{
				if (count % div != 0){
					break;
				}
				
				else if (count % div == 0 && div == 20) {
					complete = true;
					
				}
			}
		}
		
		while(!complete);
		System.out.println(count);
		
	}

}
