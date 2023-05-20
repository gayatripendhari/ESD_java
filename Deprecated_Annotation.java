class Demo
{
	void display1()
	{
		System.out.println("Hello Friends ....");
	}
	
	@Deprecated
	void display2()
	{
		System.out.println("********************");
	}
}
class Deprecated_Annotation
{
	public static void main(String args[ ])
	{
		Demo ob=new Demo();
		ob.display1();
		ob.display2();
	}
}