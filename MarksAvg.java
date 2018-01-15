import java.util.Scanner;
public class MarksAvg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first subject marks");

				int sub1=sc.nextInt();
				
				System.out.println("enter the second subject marks");
 int sub2=sc.nextInt();
 
 System.out.println("enter the third subject marks");
	int sub3=sc.nextInt();
	
	System.out.println("enter the fourth subject marks");
	
	int sub4=sc.nextInt();
	
	System.out.println("enter the fifth subject marks");
	int sub5=sc.nextInt();
	
	System.out.println("enter the sixth subject marks");
	
	int sub6=sc.nextInt();
	
	int total=sub1+sub2+sub3+sub4+sub5+sub6;
	System.out.println("the total number of marks student got is " +total);
	
	double avg=total/6;
	
	System.out.println("the total avg for the 6 subjects is " +avg);
	
	
	
	}

}
