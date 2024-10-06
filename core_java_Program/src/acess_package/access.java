package acess_package;
import calculator.*;
import java.util.*;
public class access {

	public static void main(String[] args) 
	{
		int a,b;
		Scanner t1=new Scanner(System.in);
		System.out.println("enter the two number for calculation");
		a=t1.nextInt();
		b=t1.nextInt();
		addition a1=new addition();
		a1.add(a,b);
		substraction s1=new substraction();
		s1.sub(a, b);
		
		multiplication m1=new multiplication();
		m1.mul(a, b);
		
		division d1=new division();
		d1.divi(a, b);

	}
	

}
