package patttern_corejava;

public class pyramid_patternwithnuumber {

	public static void main(String[] args)
	
	{
		int i,j,k;
		int num=2;
		for(i=1;i<=3;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
			
				System.out.print(num+" ");
				num=num+2;
			}
			System.out.println();
		}

	}

}
