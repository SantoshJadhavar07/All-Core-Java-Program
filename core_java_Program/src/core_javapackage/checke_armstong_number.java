package core_javapackage;

import java.util.*;

public class checke_armstong_number {

	public static void main(String[] args) 
	
	{
		
    int num, rem, temp, ans=0;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number");
    num=sc.nextInt();
    
    temp=num;
    
   while(temp>0)
    {
    	rem = temp % 10;
    	ans = ans + rem*rem*rem;
    	temp = temp / 10;
    }
   if(num==ans)
   {
	   System.out.println(num+" is the armstrong number");
   }
   else
   {
	   System.out.println(num+" is not a armstrong number");
   }
	}
	

}
