package patttern_corejava;

public class leftangle_triangle_1to5 {

	public static void main(String[] args)
	
	{
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{

				System.out.print(k);
			
			}
			System.out.println();
		}
	}

}
			



