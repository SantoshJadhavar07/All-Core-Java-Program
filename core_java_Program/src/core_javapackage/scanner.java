package core_javapackage;

import java.util.Scanner;

public class scanner {
	
	public static void main(String []args)
	{
	
		System.out.println("enter your name");
		Scanner ab=new Scanner(System.in);
		String str=ab.next();
		
		System.out.println("hello good morning "+str);
		
		System.out.println("enter your surname");
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		
		System.out.println("your surname is "+str1);
		
	}

}
