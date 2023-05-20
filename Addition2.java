import java.util.*;
class Addition2
{
	public static void main(String args[ ])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number1");
		int num1=sc.nextInt();

		System.out.println("Enter number2");
		int num2=sc.nextInt();

		int num3=num1+num2;
		System.out.println("Addition = "+num3);
	}
}