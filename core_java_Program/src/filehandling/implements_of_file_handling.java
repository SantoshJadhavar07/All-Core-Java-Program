package filehandling;

import java.io.*;
public class implements_of_file_handling 
{

	public static void main(String[] args) throws Exception
	{
		
	  FileOutputStream f1 = new FileOutputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\File Handling Java\\santy.txt");
	  
	  String x="Jay Shree Krishn";
	  
	  f1.write(x.getBytes());
	  System.out.println("record saved");

		
		FileInputStream f2=new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\File Handling Java\\santy.txt");
		
		int y;
		
		while((y=f2.read()) != -1)
		{
			System.out.print((char)y);
		}
	}

}
