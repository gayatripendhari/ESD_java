import java.util.*;
class Stack_Demo
{
	public static void main(String args[ ])
	{
		Stack s=new Stack();
		
		s.push(10);
		s.push(20);
		s.push("apple");
		s.push("Mango");

		System.out.println("Elements of Stack = "+s);
		System.out.println("20 is prsent = "+s.contains(20));

		System.out.println("Top element = "+s.peek());	//it will display top element of stack

		System.out.println("Popped item = "+s.pop());

		System.out.println("Elements of Stack = "+s);
	}
}