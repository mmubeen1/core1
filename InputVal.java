import java.util.*;

public class InputVal {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the a value");
		
		int a=sc.nextInt();
		
		System.out.println("enter the b value");
		
		int b=sc.nextInt( );
		
		
		for (int i=a; i<=b; i++)
		{
			
	int square=i*i;
		
			System.out.println(i+ "\t" +square);
		}

	}

}
