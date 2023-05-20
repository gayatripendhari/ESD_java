//no. of lines, spaces & characters in file....
import java.io.*;
class File_Count_Demo
{
	public static void main(String args[ ])
	{
		try
		{
			FileInputStream ob=new FileInputStream("abc.txt");
			
			int counter_l=0,counter_s=0,counter_c=0;
			
			int a;
			while((a=ob.read())!=-1)	//-1 is EOF
			{
				char temp=(char)a;

				if(temp==' ')
				{
					counter_s++;
				}
				else if(temp=='\n')
				{
					counter_l++;
				}
				else
				{
					counter_c++;
				}
			}
			System.out.println("No. of Spaces = "+counter_s);
			System.out.println("No. of Lines = "+counter_l);
			System.out.println("No. of Characters = "+counter_c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}