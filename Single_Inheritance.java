class Number1
{
	int a;
	
	void set_a(int x)
	{
		a=x;
	}
	void display_a()
	{
		System.out.println("Value of a = "+a);
	}
}
class Number2 extends Number1
{
	int b;
	void set_b(int y)
	{
		b=y;
	}
	void display_b()
	{
		System.out.println("Value of b = "+b);
	}
}
class Single_Inheritance
{
	public static void main(String args[ ])
	{
		Number2 ob=new Number2();
		ob.set_a(100);
		ob.set_b(200);

		ob.display_a();
		ob.display_b();
	}
}