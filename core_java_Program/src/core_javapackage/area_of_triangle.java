package core_javapackage;

import java.util.Scanner;

public class area_of_triangle {

	public static void main(String[] args) 
	{
		int l,h;
		double area;
		
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the lenght and height");
	    l=s1.nextInt();
	    h=s1.nextInt();
	    
	    area=(1/2)*l*h;
	    System.out.println(area);

	}

}
