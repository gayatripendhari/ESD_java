import java.util.*;
class Student
{
	int roll;			//Data Members(3)			//members(5)
	String name;
	float per;


	Student(int r,String n,float p)		//parametrized constructor
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
class Constructor2
{
	public static void main(String args[ ])
	{
		Student ob1=new Student(1,"Jay",78.67f);
		
		ob1.display();

		Student ob2=new Student(2,"Kartik",89.78f);
		ob2.display();
				
	}
}