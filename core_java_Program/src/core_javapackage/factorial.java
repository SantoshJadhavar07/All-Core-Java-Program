package core_javapackage;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		
		int num, factorial=1;
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any number");
		num=s1.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			factorial = factorial * i;
		}
		
     System.out.println(factorial);
	}

}
