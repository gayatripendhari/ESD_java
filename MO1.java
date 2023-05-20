class Base
{
	void display()
	{		
		System.out.println("Hi.....");
	}
}
class Derived extends Base
{
	void display()
	{		
		System.out.println("Hello .....");
	}
}
class MO1
{
	public static void main(String args[ ])
	{
		Derived ob1=new Derived();
		ob1.display();		//hello

		Base ob2=new Base();
		ob2.display();		//hi
	}
}