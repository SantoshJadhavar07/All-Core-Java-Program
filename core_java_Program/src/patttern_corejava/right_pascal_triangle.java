package patttern_corejava;

public class right_pascal_triangle {

	public static void main(String[] args)
	{

		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

		for(int i=2;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
