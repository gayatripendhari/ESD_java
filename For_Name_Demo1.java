class Simple
{
}    
class For_Name_Demo1
{    
 	public static void main(String args[]) throws Exception
 	{    
		//Simple s=new Simple();

  		Class c=Class.forName("Simple");    
  		System.out.println("Name of the class = "+c.getName());    
 	}    
}
