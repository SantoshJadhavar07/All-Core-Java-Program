package patttern_corejava;

public class diamond_pattern_2logic {

	public static void main(String[] args) 
	{
		int n=3;
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i=n-1;i>=1;i--)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
