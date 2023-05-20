import java.util.*;
class Loop_Demo
{
	public static void main(String args[ ])
	{

		Scanner s=new Scanner(System.in);

		System.out.println("Enter any number");
		int num=s.nextInt();

		int fact=1;
		int i;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorail = "+fact);
	}
}
/*
	5!=1*2*3*4*5
	    = 120

	4!=1*2*3*4
	    =24
*/