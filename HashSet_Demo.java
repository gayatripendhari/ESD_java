import java.util.*;
class HashSet_Demo
{
	public static void main(String args[ ])
	{
		HashSet ob=new HashSet();
		
		ob.add("abc");
		ob.add(10);
		ob.add(3.14f);

		ob.add("xyz");

		ob.add(10);
		
		System.out.println("Elements of hash Set = "+ob);
	}
}