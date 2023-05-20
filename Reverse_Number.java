import java.util.*;
class Reverse_Number
{
	public static void main(String args[ ])
	{

		Scanner s=new Scanner(System.in);

		System.out.println("Enter any number");
		int num=s.nextInt();

		System.out.println("Reverse Number  : ");
		
		while(num>0)
		{
			int r=num % 10;
		
			System.out.print(r);

			num=num / 10;
		}		
	}
}

/*
input number 489
reverse number = 984
%10
/10


489
1)489 % 10 = 9
     489 / 10 = 48
2) 48 % 10 = 8
      48 / 10 = 4
3) 4 % 10 = 4
     4 / 10 = 0	
*/