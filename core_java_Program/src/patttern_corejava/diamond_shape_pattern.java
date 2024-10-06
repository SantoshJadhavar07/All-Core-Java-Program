package patttern_corejava;

public class diamond_shape_pattern {

	public static void main(String[] args) 
	{
	
	int i,j,k;
	for(i=1;i<5;i++)
	{
		for(j=3;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}

	for(i=2;i>=0;i--)
	{
		for(j=i;j<3;j++)
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
