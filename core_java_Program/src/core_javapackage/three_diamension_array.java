package core_javapackage;

import java.util.Scanner;

public class three_diamension_array {

	public static void main(String[] args)
	{
		int a[][][] = new int [2][3][3];
		
		int k,i,j;
		Scanner s1=new Scanner (System.in);
		System.out.println("enter array element:");
		for(k=0;k<2;k++)
		{
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[k][i][j]=s1.nextInt();
			}
		}

	}
		for(k=0;k<2;k++)
		{
		for(j=0;j<3;j++)
		{
			for(i=0;i<3;i++)
			{
				System.out.print(a[k][i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

	}
		
	}

}
