import java.util.Scanner;
public class PayrollProg {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of hours employee worked");
		double a=sc.nextDouble(); 
		
		System.out.println("enter hourly rate");
		double b=sc.nextDouble();
		 
		System.out.println("the number of hours employee worked is " +a);
		System.out.println(" the hourly rate is " +b);
		double c=a*b;
		System.out.println("the salary of the person per month is " +c);

	}

}
