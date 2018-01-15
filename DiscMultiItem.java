import java.util.Scanner;
public class DiscMultiItem {
	
	
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("How much the price value");
		
		double price=sc.nextDouble();
		
System.out.println("how many cookies are in a bucket");
		
		double nOfCookie=sc.nextInt();
		
		System.out.println("how many cakes in a bucket");
	    double nOfCake=sc.nextInt();
	    double varCoo=nOfCookie*0.05;
		double varCak=nOfCake=0.03;
		
			
			
			double priceVal=price-(varCoo+varCak);
			
			System.out.println("price after the deduction" +priceVal);
		
		if(price>10)
		{
		
		
			
			
			double disPriceVal= (priceVal*5)/100;
					
		     
			System.out.println("the 5% the discount is " +disPriceVal);

			double amoutTake=priceVal-disPriceVal;

			System.out.println("the amount to take after discount $ "+amoutTake);

			
		
		}
		
		else {
			
			System.out.println("the discount could not be done as it is below $10");
			
			System.out.println("the value without discount is " +priceVal);
						
		}
		
		
	}

}
