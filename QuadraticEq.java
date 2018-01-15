import java.util.Scanner;
public class QuadraticEq
{
  public static void main(String args[]) {

  
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the x value for the quadratic equation");

  int x=sc.nextInt();
  
  int b=3*(x*x)-(8*x)+4;
  
  System.out.println("Result after submitting x is" +b);
  
  }	
  
}
