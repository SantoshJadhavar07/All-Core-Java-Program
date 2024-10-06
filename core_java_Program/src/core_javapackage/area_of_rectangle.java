package core_javapackage;

import java.util.Scanner;

public class area_of_rectangle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int l,b;
		double area;
		
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the lenght and breid");
	    l=s1.nextInt();
	    b=s1.nextInt();
	    
	    area=l*b;;
	    System.out.println(area);
	    
	    
	}

}
