import java.util.*;
class Student
{
	int roll;			//Data Members(3)			//members(5)
	String name;
	float per;

	static String subject="Java";

	Student()				//default Constructor
	{
		roll=0;
		name="XXX";
		per=40.0f;
	}
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
		System.out.println("Learning Subject= "+subject);
	}
	
}
class Static1
{
	public static void main(String args[ ])
	{
		Student ob1=new Student(1,"Jay",78.67f);
		
		ob1.display();

		Student ob2=new Student(2,"Kartik",89.67f);
		ob2.display();
				
	}
}