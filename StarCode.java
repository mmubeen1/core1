package com.apex.assignment4;


import java.util.Scanner;
public class StarCode {
	
	
	public static void main(String []arg)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of rows you want");		
		int i=sc.nextInt();
		
		
		for(int row=i; row>=1;--row)
		{
			
			for (int col=1; col<=row; ++col)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
	}

}








