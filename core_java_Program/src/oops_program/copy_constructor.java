package oops_program;

class demo
{  
	String y;
   int x;
   
	demo(int a, String b)
	{
		x=a;
		y=b;
	
		System.out.println(a);
		System.out.println(y);
	}
	demo(demo k)
	{	   
		x=k.x;
	    y=k.y;
	     
		System.out.println(x);	}
}

public class copy_constructor {

	public static void main(String[] args) 
	{
      new demo(2,"santy");
    //  demo s2 = new demo(s1);

	}

}
