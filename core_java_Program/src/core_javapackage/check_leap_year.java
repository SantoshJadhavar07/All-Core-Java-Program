package core_javapackage;
import java.util.*;
public class check_leap_year {

	public static void main(String[] args)
	{
		int year;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter any year");
		year=s1.nextInt();
		
		if(year%4==0)
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+" is not leap year");
		}

	}

}
