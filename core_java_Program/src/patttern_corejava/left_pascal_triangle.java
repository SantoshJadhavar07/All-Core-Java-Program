package patttern_corejava;

public class left_pascal_triangle {

	public static void main(String[] args)
	{
      int num=3;
      for(int i=1;i<=num;i++)
      {
    	  for(int k=2;k>=i;k--)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int j=1;j<=i;j++)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
      
      
      for(int i=num-1;i>=1;i--)
      {
    	  for(int k=i;k<=2;k++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int j=1;j<=i;j++)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }

	}

}
