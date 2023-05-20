import java.util.*;		//* means we can use all classes from that package

class PackageDemo3
{
	public static void main(String args[ ])
	{
		Scanner s=new Scanner(System.in);		//qaulified name

		System.out.println("Enter any integer number");
		int a=s.nextInt();

		System.out.println("Value of a = "+a);

		Date ob=new Date();
		System.out.println("Today''s Date = "+ob);
		
	}
}