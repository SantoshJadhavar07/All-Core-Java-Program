package core_javapackage;

import java.util.Scanner;

public class hollow_pattern_from2array {

	public static void main(String[] args)
	{
		int arr[][] = new int[4][4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==0 || i==arr.length-1 || j==0 || j==arr.length-1)
				{
			System.out.print(arr[i][j]);
			}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}
