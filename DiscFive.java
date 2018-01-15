import java.util.Scanner;

public class DiscFive {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);

System.out.println("enter the price for discount");

     double price=sc.nextDouble();
     
     double disVal=(price*5)/100;
     
System.out.println("the 5% the discount is " +disVal);

double amoutTake=price-disVal;

System.out.println("the amount to take after discount "+amoutTake);


	}

}
