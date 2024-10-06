package multithreading;

class music extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			
		System.out.println("count : "+i);
		
		}
	}
	
	
	
}
class pakistan extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			
		System.out.println("flag : "+i);
		
		}
	}
}
public class with_extends_thread_class {

	public static void main(String[] args)
	{
		
         music m1 = new music();
         m1.start();
         pakistan p1 = new pakistan();
         p1.start();
	}

}
