package core_javapackage;

import java.util.*;
public class fibonacci_series {

	public static void main(String[] args) {
		
		
		int num1, num2, temp;
		int lim;
		
		Scanner s1=new Scanner (System.in);
	  System.out.println("enter any two number");
	  num1=s1.nextInt();
	  num2=s1.nextInt();
	  System.out.println("enter limit for series");
	  lim=s1.nextInt();
	  
	  for(int i=0;i<=lim;i++)
	  {
		 temp=num1+num2;
		 num1=num2;
		 num2=temp;
		 System.out.println(temp);
	  }
		
	}

}
