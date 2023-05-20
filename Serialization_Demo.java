import java.io.*;
class Student implements Serializable
{
	int roll;
	String name;
	float per;
	Student()
	{
		roll=0;
		name="xxxx";
		per=40.0f;
	}
	Student(int r,String n,float p)
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
class Serialization_Demo
{
	public static void main(String args[ ])
	{
		try
		{
			Student s1=new Student(1,"Komal",98.56f);
			Student s2=new Student();

			//serialization

			FileOutputStream fos=new FileOutputStream("mystudents.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);

			oos.writeObject(s1);

			oos.close();
			fos.close();	

			//Deserialization
			FileInputStream fis=new FileInputStream("mystudents.txt");	
			ObjectInputStream ois=new ObjectInputStream(fis);

			s2=(Student)ois.readObject();

			s2.display();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}