package com.apex.secassignment;
 
import java.util.Scanner;
import static java.lang.System.in;

public class Fibona 
{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the Fibonacci limit");
	
	int limit=sc.nextInt();
	
	
	
    int[] feb = new int[limit];
    feb[0] = 0;
    feb[1] = 1;
    for(int i=2; i < limit; i++){
        feb[i] = feb[i-1] + feb[i-2];
    }

    for(int i=0; i< limit; i++){
            System.out.print(feb[i] + " ");
	
	
	
	
	
	
	sc.close();
	}
	
}
}
