import java.util.*;
class Armstrong_Number
{
	public static void main(String args[ ])
	{

		Scanner s=new Scanner(System.in);

		System.out.println("Enter any number");
		int num=s.nextInt();

		int num1=num;

		int sum=0;
		while(num>0)
		{
			int r=num % 10;
		
			sum=sum+(r*r*r);
	
			num=num / 10;
		}
		if(num1==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("It's not Armstrong Number");
		}		
	}
}

/*
Armstrong Number
input number 153
 1=(1*1*1)=1 
5=(5*5*5)=125
3=(3*3*3)=27
---------------------
	153
*/