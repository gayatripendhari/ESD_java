import java.util.*;

class Nested_try_catch
{
	public static void main(String args[ ])
	{
		int a=10;

		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int b=s.nextInt();

		int c=0;

		try	//outer try block
		{
		
			if(b==0)
			{
			c=a/b;			//it will generate arithmatic exception
			}

			try			//inner try block
			{
				if(b==1)
				{
				c=a/(b-b);		//it will generate arithmatic exception
				}
				else
				{
				int d[ ]={10,20,30,40,50};
				d[9]=100;			//array index out of exception
				}
			}
			catch(ArrayIndexOutOfBoundsException ab)
			{
			System.out.println("THis catch block handles only Array index Exception");
			ab.printStackTrace();
			}
		
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("This is outer catch block handles only Arithmatic Exception");
			ae.printStackTrace();
		}
		
		catch(Exception e)		//it will catch all type of exceptions.
		{
			System.out.println("Here all type of exceptions are get catched.....");
			e.printStackTrace();
		}
	}
}