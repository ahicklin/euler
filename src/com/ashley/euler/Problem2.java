package com.ashley.euler; 

public class Problem2 {
    public static void main(String[] args) {

        int Num1 = 0;
        int Num2 = 1;
        int sum = 0;
        int temp = 0;

        do
        {
           if (Num2 % 2 ==0)
        	   sum = sum + Num2;
           temp = Num1 + Num2;
           	Num1 = Num2;
           	Num2 = temp; 
    }
        while (Num2 < 4000000);

        System.out.println(sum);
    }
} 
