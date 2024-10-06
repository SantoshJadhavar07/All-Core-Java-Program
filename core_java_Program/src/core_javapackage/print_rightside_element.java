package core_javapackage;
import java.util.*;
public class print_rightside_element {

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
    	 a[i]=a[i]%10;
    	 System.out.print(a[i]+" ");
     }

	}

}
