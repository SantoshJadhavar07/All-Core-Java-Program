package core_javapackage;

import java.util.*;
public class test1_perfect_number {

	public static void main(String[] args)
	{
		int num;
		int count=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any number");
		num=s1.nextInt();
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				
				count=count+i;
			}
		}
		if(num==count)
		{
			System.out.println(num+" is the perfect number");
		}
		else
			System.out.println(num+" is not a perfect number");

	}

}
