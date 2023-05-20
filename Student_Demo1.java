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
		System.out.println("Roll Number = "+roll);
		System.out.println("Name = "+name);
		System.out.println("Percentage = "+per);
	}
	
}
class Student_Demo1
{
	public static void main(String args[ ])
	{
		Student ob1=new Student();
		ob1.setData(1,"Jay",98.56f);
		ob1.display();

		Student ob2=new Student();
		ob2.setData(2,"Kartik",89.56f);
		ob2.display();
	}
}