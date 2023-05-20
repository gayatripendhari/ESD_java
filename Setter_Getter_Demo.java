class Student
{
	int roll;			//Data Members
	String name;
	float per;

	void setRoll(int r)		// 3 setter methods
	{
		roll=r;
	}
	void setName(String n)
	{
		name=n;
	}
	void setPer(float p)
	{
		per=p;
	}
	int getRoll()		// 3 getter methods
	{
		return roll;
	}
	String getName()
	{
		return name;
	}
	float getPer()
	{
		return per;
	}
}
class Setter_Getter_Demo
{
	public static void main(String args[ ])
	{
		Student ob1=new Student();
		
		ob1.setRoll(1);
		ob1.setName("Komal");
		ob1.setPer(89.67f);

		int a=ob1.getRoll();
		String b=ob1.getName();
		float c=ob1.getPer();
		
		System.out.println("Roll Number = "+a);
		System.out.println("Name = "+b);
		System.out.println("Percentage = "+c);
	}
}