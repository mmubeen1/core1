import java.util.Scanner;
public class UsGovProj {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		

double leftWeight=0;


double rightWeight=0;



	
	while(leftWeight==rightWeight)
	{
		
		System.out.println("enter the left side weight");
		leftWeight=sc.nextDouble();
		
		System.out.println("enter the right side weight");
		rightWeight=sc.nextDouble();
		
		if(leftWeight==rightWeight)
		continue;
		else
			break;
	}	
	
	
	System.out.println("both sides are equal");
	

	
}
}