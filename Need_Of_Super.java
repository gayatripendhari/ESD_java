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
		display_a();			//a = 0
		System.out.println("Inside parametrized Constructor of Number2 class with 2 paramters");
		a=x;				// a get replaced by 100 valuue
		b=y;
	}
	void display_b()
	{
		System.out.println("Value of b = "+b);
	}
}

class Need_Of_Super
{
	public static void main(String args[ ])
	{
		Number2 ob1=new Number2();
		ob1.display_a();		//0
		ob1.display_b();		//0

		System.out.println("------------------------------------------------");

		Number2 ob2=new Number2(100);
		ob2.display_a();
		ob2.display_b();

		System.out.println("-----------------------------------------------");

		Number2 ob3=new Number2(100,200);
		ob3.display_a();
		ob3.display_b();
		
	}
}