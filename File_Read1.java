import java.io.*;
class File_Read1
{
	public static void main(String args[ ])
	{
		try
		{
			FileInputStream ob=new FileInputStream("abcd.txt");

			int a;
			while((a=ob.read())!=-1)	//-1 is EOF
			{
				System.out.print((char)a);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}