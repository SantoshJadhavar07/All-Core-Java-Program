package oops_program;

import java.util.*;
class parking
{
	void entry()

	{
		System.out.println("parking  charges is 10 rs.");
	}
   
}
class entry extends parking
{
	void enter()
	{    String p="yes";
	     Scanner s1=new Scanner (System.in);
		System.out.println("are you relative of patient? if yes");
		
		if(p.equals("yes"))
		{
			System.out.println("go the room no 7.");
		}
	}

}
class billing extends entry
{
	int med=1000;
	int ch=200;
	int tot;
	void bill()
	{
		tot=med+ch;
		System.out.println("total bill is " +tot);
	}
}

class exit extends billing
{
	void ext()
	{
		System.out.println("thank you for using our facility");
	}
}
 

public class multilevel_inheristance 
{

	public static void main(String[] args) 
	{
		
      exit e1 = new exit();
      e1.entry();
      e1.enter();
      e1.bill();
      e1.ext();
	}

}
