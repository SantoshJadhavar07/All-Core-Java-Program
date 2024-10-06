package oops_program;
import java.util.*;
class noteligible extends RuntimeException
{
	 public noteligible(String s)
	{
		super(s);
	}
}
public class throw_exception_handlin_voting_program {

	public static void main(String[] args) 
	
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		num=sc.nextInt();
		
		if(num>18)
		{
			System.out.println("you are eligible to voting");
		}
		else
		{
              try {		
			     throw new noteligible ("you can't vote ");
              }
              catch(noteligible e)
              {
            	  System.out.println(e);
              }
              finally
              {
            	  System.out.println("you not able to voting");
              }
		
		}
	

	}

}
