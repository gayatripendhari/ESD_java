class Addition
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of two inetegrs = "+c);
	}
	void add(float x,float y)
	{
		float z=x+y;
		System.out.println("Addition of two float numbers = "+z);
	}
	void add(String s1,String s2)
	{
		String s3=s1+s2;			//addition of two strings means attachment.
		System.out.println("Addition of two Strings = "+s3);
	}
	void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("Addition of 3 integrs = "+d);
	}
}
class Method_Overloading
{
	public static void main(String args[ ])
	{
		Addition ob=new Addition();
		ob.add(67.45f,34.56f);
		ob.add(50,60);
		ob.add("Nashik","Matoshri");
		ob.add(10,20,30);
	}
}