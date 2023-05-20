import java.util.*;
class Sum_Digits
{
	public static void main(String args[ ])
	{

		Scanner s=new Scanner(System.in);

		System.out.println("Enter any number");
		int num=s.nextInt();

		int sum=0;
		while(num>0)
		{
			int r=num % 10;
		
			sum=sum+r;
	
			num=num / 10;
		}
		System.out.println("Sum of digits = "+sum);		
	}
}

/*
input number 489
4 + 8 + 9 = 21
*/