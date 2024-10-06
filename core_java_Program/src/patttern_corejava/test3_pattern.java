package patttern_corejava;

public class test3_pattern {

	public static void main(String[] args)
	{
		int num=1;
		for(int i=0;i<4;i++)
		{
			for(int k=i;k<3;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}

	}

}
