import java.util.*;
class Student
{
	int roll;			//Data Members(3)			//members(5)
	String name;
	float per;

	void setData(int r,String n,float p)	//member Functions(2)
	{
		roll=r;
		name=n;
		per=p;
	}
	void display()
	{
		/*
		System.out.println("Roll Number = "+roll);
		System.out.println("Name = "+name);
		System.out.println("Percentage = "+per);
		*/
		System.out.println("Roll Number = "+roll+" Name = "+name+" percentage = "+per);
		System.out.println("-----------------------------------------------------------------------------------");
	}
	
}
class Array_Of_Objects
{
	public static void main(String args[ ])
	{
		Student ob[ ]=new Student[3];

		ob[0].setData(1,"Jay",78.67f);
		ob[1].setData(2,"Kartik",78.34f);
		ob[2].setData(3,"komal",56.45f);

		for(int i=0;i<3;i++)
		{
			ob[i].display();
		}
		
	}
}