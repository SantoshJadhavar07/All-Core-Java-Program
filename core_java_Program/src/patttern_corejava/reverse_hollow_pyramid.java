package patttern_corejava;

public class reverse_hollow_pyramid {

	public static void main(String[] args)
	{
		int i,j,k;
		for(i=3;i>=0;i--)
		{
			for(j=i;j<=3;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
			      if(i==2 &&  k==1 )
			      {
			    	  System.out.print("  ");
			      }
			      else
			      {
				System.out.print("* ");
			      }
			}
			System.out.println();
		}
		
		

	}

}
