import java.util.*;
class Loop_Demo
{
	public static void main(String args[ ])
	{

		Scanner s=new Scanner(System.in);

		System.out.println("Enter any number");
		int num=s.nextInt();

		int sum=0;
		while(num!=0)
		{
			sum=sum+num;
		
			System.out.println("Enter any number");
			num=s.nextInt();
			
		}
		System.out.println("Addition of Numbers = "+sum);
	}
}
