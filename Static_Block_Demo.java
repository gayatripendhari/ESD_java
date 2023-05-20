
class Static_Block_Demo
{
	static int a;	
	public static void main(String args[ ])
	{
		System.out.println("Hello friends I m in main method");
		System.out.println("Value of a = "+a);
	}
	static
	{
		System.out.println("Welcome");
		a=100;
	}
}