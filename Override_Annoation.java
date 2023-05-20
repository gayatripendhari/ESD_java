class Base
{
	void display()
	{
		System.out.println("Hi I am from Base Class");
	}

}
class Derived extends Base
{
	@Override
	void display()
	{
		System.out.println("Hello I am from Derived class");
	}
}
class Override_Annoation
{
	public static void main(String args[ ])
	{
		Derived ob=new Derived();
		ob.display();
	}
}