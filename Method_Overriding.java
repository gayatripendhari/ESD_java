abstract class Figure
{
	
	abstract void calculate();
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
class Method_Overriding
{
	public static void main(String args[ ])
	{	
		
		Rectangle R=new Rectangle(6,4);
		R.calculate();
		R.display();

		Circle C=new Circle(7);
		C.calculate();
		C.display();

		//Figure F=new Figure();		
	}
}