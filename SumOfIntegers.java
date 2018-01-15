package com.apex.assignment4;

import java.util.Scanner;
public class SumOfIntegers {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the integer");
		
		int integer=sc.nextInt();
		
		
	    int sum =0;
		int count =1;
		
		while (count<=integer)
		{
			
	    sum=integer;
			count++;
		
		}
		
		System.out.println("Sum is: " +sum);
	
	}

}
