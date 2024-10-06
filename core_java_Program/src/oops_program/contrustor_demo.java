package oops_program;

 class sample
 {
	 sample()
		{
			int a=10;
			int b=10;
			int c;
			c=a*b;
			System.out.println(c);
		}
		sample( int x, int y)
		{
			int c;
			c=x+y;
			System.out.println(c);
		}
 }
public class contrustor_demo {

	
	
	public static void main(String[] args)
	{
		new sample();
		new sample(10,10);
		
	}

}
