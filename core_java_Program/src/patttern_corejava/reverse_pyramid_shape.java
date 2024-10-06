package patttern_corejava;

public class reverse_pyramid_shape {

	public static void main(String[] args) 
	
	{
		int i,j,k;
		for(i=5;i>=0;i--)
		{
			for(j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
			
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
