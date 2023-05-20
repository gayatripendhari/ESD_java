import java.io.*;
class File_Write
{
	public static void main(String args[ ])
	{
		try
		{
			FileOutputStream ob=new FileOutputStream("abc.txt");

			String str="Sachin Tendulkar is my favourite player.";

			byte b[ ]=str.getBytes();	//getBYtes() will calculate ascii values from every staring character

			ob.write(b);
		}
		catch(Exception e)
		{
		}
	}
}