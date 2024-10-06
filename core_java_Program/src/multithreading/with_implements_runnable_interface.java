package multithreading;

class youtube implements Runnable
{

	@Override
	public void run() {
		
			for(int i=0;i<10;i++)
			{
				
			System.out.println("count : "+i);
			
			
		}
		
		
	}
}
class music2 implements Runnable
{
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			
		System.out.println("flag : "+i);
		
		
	}
	
	
}

	
}

public class with_implements_runnable_interface {

	public static void main(String[] args) 
	{
	    youtube m1 = new youtube();
		Thread t1 = new Thread(m1);
		t1.start();
		
		music2 m2 = new music2();
		Thread t2 = new Thread(m2);
		t2.start();
		
		
		

	}

}
