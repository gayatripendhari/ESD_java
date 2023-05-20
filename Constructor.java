import java.util.*;
class Student
{
	int roll;			//Data Members(3)			//members(5)
	String name;
	float per;


	Student()		//default constructor
	{
		roll=0;
		name="xxxx";
		per=40.0f;
	}
	void setData(int r,String n,float p)	//member Functions(2)
	{
		roll=r;
		name=n;
		per=p;
	}
	void display()
	{
		
		System.out.println("Roll Number = "+roll);
		System.out.println("Name = "+name);
		System.out.println("Percentage = "+per);
		
	}
	
}
class Constructor1
{
	public static void main(String args[ ])
	{
		Student ob1=new Student();
		
		ob1.display();

		Student ob2=new Student();
		ob2.display();
				
	}
}