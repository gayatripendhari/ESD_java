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
class Number3 extends Number2
{
	int c;
	void set_c(int z)
	{
		c=z;
	}
	void display_c()
	{
		System.out.println("Value of c = "+c);
	}
}
class Multilevel_Inheritance
{
	public static void main(String args[ ])
	{
		Number3 ob3=new Number3();
		ob3.set_a(1000);
		ob3.set_b(2000);
		ob3.set_c(3000);

		ob3.display_a();
		ob3.display_b();
		ob3.display_c();
	}
}