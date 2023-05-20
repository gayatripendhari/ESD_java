import java.util.*;
class Count_Number
{
	public static void main(String args[ ])
	{

		Scanner s=new Scanner(System.in);

		System.out.println("Enter any number");
		int num=s.nextInt();

		int counter1=0,counter2=0;
		while(num>0)
		{
			int r=num % 10;
		
			if(r%2==0)
			{
				counter1++;
			}
			else
			{
				counter2++;
			}
			num=num / 10;
		}
		System.out.println("No. of even NUmbers = "+counter1);
		System.out.println("No. of Odd Numbers = "+counter2);
	}
}

/*
input number = 489
Even number = 2
Odd number = 1

*/