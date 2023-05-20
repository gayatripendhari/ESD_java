import java.io.*;
class File_available_Demo
{
	public static void main(String args[ ])
	{
		try
		{
			FileInputStream ob=new FileInputStream("abc.txt");
			System.out.println("Total No. of Bytes available in File = "+ob.available());

			
			int a;
			while((a=ob.read())!=-1)	//-1 is EOF
			{
				System.out.println("Redaed Data = "+(char)a+"\t"+"Total no. of bytes avaialbale ="+ob.available());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}