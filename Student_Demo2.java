import java.util.*;
class Student
{
	int roll;			//Data Members(3)			//members(5)
	String name;
	float per;

	void setData()	//member Functions(2)
	{
		Scanner s=new Scanner(System.in);
	
		System.out.println("Enter roll number");
		roll=s.nextInt();
		System.out.println("Enter Name");
		name=s.next();
		System.out.println("Enter percentage");
		per=s.nextFloat();
	}
	void display()
	{
		/*
		System.out.println("Roll Number = "+roll);
		System.out.println("Name = "+name);
		System.out.println("Percentage = "+per);
		*/
		System.out.println("Roll Number = "+roll+" Name = "+name+" percentage = "+per);
	}
	
}
class Student_Demo2
{
	public static void main(String args[ ])
	{
		Student ob1=new Student();
		ob1.setData();
		ob1.display();

		Student ob2=new Student();
		ob2.setData();
		ob2.display();
	}
}