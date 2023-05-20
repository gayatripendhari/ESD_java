class Simple
{
}  
class Student
{
}
  
class Test
{
	void printName(Object obj)		//Object s
	{  
  		Class c=obj.getClass();    
  		System.out.println(c.getName());  
  	}  
}
class get_Class_Demo
{  
  	
  	public static void main(String args[])
	{  
   		Simple s=new Simple();  
   
   		Test t=new Test();  
   		t.printName(s);  

		Student ob=new Student();
		t.printName(ob);
 	}  
}  
