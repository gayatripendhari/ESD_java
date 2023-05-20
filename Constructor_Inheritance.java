class Number1
{
	Number1()
	{
		System.out.println("Inside Number 1 class");
	}
}
class Number2 extends Number1
{
	Number2()
	{
		System.out.println("Inside Number2 class");
	}
}
class Number3 extends Number2
{
	Number3()
	{
		System.out.println("Inside Number3 class");
	}
}
class Constructor_Inheritance
{
	public static void main(String args[ ])
	{
		Number3 ob=new Number3();
	}
}