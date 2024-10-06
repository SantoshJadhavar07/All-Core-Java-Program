package core_javapackage;

import java.util.Scanner;

public class print_leftside_arrayelement {

	public static void main(String[] args)
	
	{
		 int a[]=new int[5];
	     
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter array element");
	     for(int i=0;i<5;i++)
	     {
	     a[i]=sc.nextInt();
	     }
	         
	     System.out.println("print rightside digit");
	     for(int i=0;i<5;i++)
	     {
	    	 a[i]=a[i]/10;
	    	 System.out.print(a[i]+" ");
	     }
	}

}
