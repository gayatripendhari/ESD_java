class Finally_Demo1
{
	public static void main(String args[ ])
	{
		int a=10;
		int b=0;
		int c=0;

		System.out.println("Doing Divison ..............");
		
		try
		{
		c=a/b;
		}
		finally
		{
		System.out.println("Divison = "+c);

		System.out.println("**********");
		}
	}
}