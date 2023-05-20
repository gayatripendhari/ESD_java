import java.util.*;
class Student
{
	int roll;			//Data Members(3)			//members(5)
	String name;
	float per;
	static int counter=100;
	static String subject="Java";

	Student()				//default Constructor
	{
		counter++;
		roll=counter;
		name="XXX";
		per=40.0f;
		
	}
	Student(String n,float p)		//parametrized constructor
	{
		counter++;
		roll=counter;
		name=n;
		per=p;
		
	}
	
	void display()
	{
		System.out.println("Roll Number = "+roll);
		System.out.println("Name = "+name);
		System.out.println("Percentage = "+per);
		System.out.println("Learning Subject= "+subject);
		System.out.println("------------------------------------------------");
	}
	
}
class Static3		
{
	public static void main(String args[ ])
	{
		Student ob1=new Student("Jay",78.67f);
		
		ob1.display();

		Student ob2=new Student("Kartik",89.67f);
		ob2.display();

		Student ob3=new Student();
		ob3.display();
				
	}
}