import java.util.Scanner;

public class RootQuad {

	public static void main(String[] args) 
	
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value for first coefficient");
		
		double a=sc.nextDouble();
		
		System.out.println("enter the value for second Coefficient");
		double b=sc.nextDouble();
		
		System.out.println("enter the value for third Coefficient");
        double c=sc.nextDouble();
        
        
       double dis= (b*b)-(4*a*c);
        
        double root1= (-b+Math.sqrt(dis))/(2*a);
        double root2= (-b-Math.sqrt(dis))/(2*a);
        
        System.out.println("the first root is " +root1);
        System.out.println("the second root is" +root2);
        
        
	}

}
