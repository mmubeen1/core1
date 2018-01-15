import java.util.Scanner;
public class AvgScoreThreeSt {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		int sub1,sub2,sub3,sub4,sub5,sub6,total;
		double avg;
		
			
		while(i<3)
		{
			i++;
			System.out.println("marks for student " +i);
		System.out.println("enter the first subject marks");

				 sub1=sc.nextInt();
				
				System.out.println("enter the second subject marks");
 sub2=sc.nextInt();
 
 System.out.println("enter the third subject marks");
	 sub3=sc.nextInt();
	
	System.out.println("enter the fourth subject marks");
	
	 sub4=sc.nextInt();
	
	System.out.println("enter the fifth subject marks");
	 sub5=sc.nextInt();
	
	System.out.println("enter the sixth subject marks");
	
	 sub6=sc.nextInt();
	
	total=sub1+sub2+sub3+sub4+sub5+sub6;
	System.out.println("the total number of marks student got is " +total);
	
	 avg=total/6;
	
	System.out.println("the total avg for the 6 subjects is " +avg);
	
		}
	
	}
	
	
	

}
