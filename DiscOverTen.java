import java.util.Scanner;
public class DiscOverTen {
	
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		
		
		System.out.println("enter the price for discount");

		     double price=sc.nextDouble();
		
		     
		     if(price>10)
		     {
		     double disVal=(price*5)/100;
		     
		System.out.println("the 5% the discount is " +disVal);

		double amoutTake=price-disVal;

		System.out.println("the amount to take after discount $ "+amoutTake);

		     }
		     else
		     {
		    	 System.out.println("the discount could be done only over $10");
		    	 
		    	 System.out.println("the amount to take without discount $ "+price);
		     }
		
		
	}

}
