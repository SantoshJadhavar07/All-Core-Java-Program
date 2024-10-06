package patttern_corejava;

public class hollow_pyramid {

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
				if(i==3 && j==2)
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
