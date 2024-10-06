package core_javapackage;
import java.util.*;
public class palindrome {
	public static void main(String[]args)
	{

	int num, temp;
	int rev=0;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter any number");
      num=s1.nextInt();
    temp=num;
	for(int i=0;num!=0;i++)
     
	{
		int rem = num % 10;
		rev = rem + rev * 10;
		num = num / 10;
	}
	System.out.println(rev);
	if(temp==rev)
	{
		System.out.println("the number is palindrome");
	}
	else
		System.out.println("the number is not palindrome");
}



}


