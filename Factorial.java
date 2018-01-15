package com.apex.assignment4;


import java.util.Scanner;
public class Factorial {

	
		public static void main(String[] args) {
		    
		    int fact=1;
		    Scanner input = new Scanner(System.in);
		    System.out.println("Enter a limit for the factorial ");
		     int num = input.nextInt();
		     
		     
		    for (int i=2;i<=num; i++){
		        fact=fact*i;
		    }

		    System.out.println("Factorial of a number is :\n"+fact);
		}

}
