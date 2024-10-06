package patttern_corejava;

public class demo_pattern

{
  public static void main(String []args)
  {
	  
  
	for(int i=1;i<=4;i++)
	{
		for(int j=0;j<4;j++)
		{
			if(i==1)
			{
			System.out.print("A");
			}
			else if(i==2)
			{
			System.out.print("B");
			}
			else if(i==3)
			{
				System.out.print("C");
			}
			else
				System.out.print("D");
		}
		
		System.out.println("");
	}
	
	System.out.println();
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
			if(j==1)
			{
			System.out.print("A");
			}
			else if(j==2)
			{
			System.out.print("B");
			}
			else if(j==3)
			{
				System.out.print("C");
			}
			else
				System.out.print("D");
		}
		
		System.out.println("");
	}
}
}
