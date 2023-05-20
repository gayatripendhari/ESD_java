import java.util.*;
class Continue_Demo
{
	public static void main(String args[ ])
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter any number");
		int num=s.nextInt();

		int i;
		for(i=1;i<=10;i++)
		{
			if(num==i)
			{
				continue;		//sets cursor to next updated value in loop
			}
			else
			{
			System.out.println(i);
			}
		}
		System.out.println("---------------------------------------------------------");
	}
}