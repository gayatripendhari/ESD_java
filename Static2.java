import java.util.*;
class Student
{
	int roll;			//Data Members(3)			//members(5)
	String name;
	float per;
	static int counter=0;
	static String subject="Java";

	Student()				//default Constructor
	{
		roll=0;
		name="XXX";
		per=40.0f;
		counter++;
	}
	Student(int r,String n,float p)		//parametrized constructor
	{
		roll=r;
		name=n;
		per=p;
		counter++;
	}
	
	void display()
	{
		System.out.println("Total No. of Objects = "+counter);
		System.out.println("Roll Number = "+roll);
		System.out.println("Name = "+name);
		System.out.println("Percentage = "+per);
		System.out.println("Learning Subject= "+subject);
	}
	
}
class Static2		
{
	public static void main(String args[ ])
	{
		Student ob1=new Student(1,"Jay",78.67f);
		
		ob1.display();

		Student ob2=new Student(2,"Kartik",89.67f);
		ob2.display();

		Student ob3=new Student();
		ob3.display();
				
	}
}