package patttern_corejava;

public class left_angle_triangle {

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
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
