class Number1
{
	int a;
	Number1()
	{
		System.out.println("Inside Default Constructor Number 1 class");
		a=0;
	}
	Number1(int x)
	{
		System.out.println("Inside Parametrized Constructor Number 1 class");
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
	Number2()
	{
		System.out.println("Inside default constructor of Number2 class");
		b=0;
	}
	Number2(int y)
	{
		System.out.println("Inside Parametrized constructor of Number2 class");
		b=y;
	}
	Number2(int x,int y)
	{

		super(x);				//it will call parametrized constructor from base class
		System.out.println("Inside parametrized Constructor of Number2 class with 2 paramters");
		//a=x;				// a get replaced by 100 valuue
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
	Number3()
	{
		System.out.println("Default Constructor of nUmber3 class");
	}
	Number3(int z)
	{
		System.out.println("Parametrized Constructor of Number3 class");
		c=z;
	}
	Number3(int x,int y,int z)
	{
		super(x,y);	//it will call constructor from Number2 class
		System.out.println("Parametrized Constructor of Number3 class with 3 parametrs");
		//a=x;
		//b=y;
		c=z;
	}
	void display_c()
	{
		System.out.println("Value of c = "+c);
	}
}

class Super2
{
	public static void main(String args[ ])
	{
		Number3 ob3=new Number3(100,200,300);
		ob3.display_a();
		ob3.display_b();
		ob3.display_c();
	}
}