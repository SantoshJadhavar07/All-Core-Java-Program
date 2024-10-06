package core_javapackage;

import java.util.Arrays;
import java.util.Scanner;

public class print_twodimmensional_array_fromuserinput {

	public static void main(String[] args)
	{
		int arr[][] = new int[2][2];
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
			System.out.print(" " +arr[i][j]);
			}
			System.out.println();
		}

	}

}
