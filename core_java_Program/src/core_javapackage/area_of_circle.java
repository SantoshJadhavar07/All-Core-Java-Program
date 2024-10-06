package core_javapackage;

import java.util.Scanner;

public class area_of_circle {

	public static void main(String[] args)
	
	{
	int r;
	double area;
	
	
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the redius");
    r=s1.nextInt();
    
    area=3.14*r*r;
    System.out.println(area);
    
    
	}

}
