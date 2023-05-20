class Number1
{
	int a;
}
class Number2 extends Number1
{
	int a;

	void set(int x,int y)
	{
		super.a=x;
		this.a=y;			//this is optional here
	}
	void display()
	{
		System.out.println("Value of a = "+super.a);	
		System.out.println("Value of a = "+this.a);	//this is optional here
	}
}
class Super3
{
	public static void main(String args[ ])
	{
		Number2 ob=new Number2();
		ob.set(67,68);
		ob.display();
		
	}
}