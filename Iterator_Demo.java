import java.util.*;
class Student
{
	int roll;
	String name;
	float per;
	
	Student()
	{
	}
	Student(int r,String n,float p)
	{
		roll=r;
		name=n;
		per=p;
	}
	public String toString()
	{		
		return "Roll Number = "+roll+" Name = "+name+" percentage = "+per;
	}

}
class Iterator_Demo
{
	public static void main(String args[ ])
	{
		Vector v=new Vector();

		Student s1=new Student(1,"Shivam",78.45f);
		v.add(s1);

		v.add(new Student(2,"Gayatri",89.56f));
		v.add(new Student(3,"Payal",79.45f));

		System.out.println("Students in Vector = "+v);

		

		Iterator I=v.iterator();		//to access elemnts one by one
		
		while(I.hasNext())
		{
			Student temp=(Student)I.next();

			System.out.println(temp);
		}

		float max=0.0f;
		Student topper=new Student();

		Iterator I2=v.iterator();		//to access elemnts one by one
		
		while(I2.hasNext())
		{
			Student temp=(Student)I2.next();

			if(max<temp.per)
			{
				max=temp.per;
				topper=temp;
			}
		}

		System.out.println("TOPPER STUDENT = "+topper);
	}
}