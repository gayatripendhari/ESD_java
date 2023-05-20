class Figure
{
	
	void calculate()
	{
		System.out.println("Every figure Have some Area");
	}
	void display()			//concrete methods
	{
		System.out.println("---------------------------------------------");
	}
	
}
class Rectangle extends Figure
{
	int l;
	int b;
	Rectangle()
	{
		l=0;
		b=0;
	}
	Rectangle(int x,int y)
	{
		l=x;
		b=y;
	}
	
	void calculate()
	{
		int temp=l*b;
		System.out.println("Area of Rectangle = "+temp);
	}
}
class Circle extends Figure
{
	int r;
	Circle()
	{
		r=0;
	}
	Circle(int x)
	{
		r=x;
	}
	void calculate()
	{
		float temp=3.14f*r*r;
		System.out.println("Area of Circle = "+temp);
	}
}
class Dynamic_Method_Dispatch
{
	public static void main(String args[ ])
	{	
		
		Figure F;

		F=new Rectangle(6,4);
		F.calculate();
		F.display();

		F=new Circle(7);
		F.calculate();
		F.display();

			
	}
}