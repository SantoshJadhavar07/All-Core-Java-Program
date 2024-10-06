package core_javapackage;

import java.util.Scanner;

public class print_sumOf_inner_element_from2darray {

	public static void main(String[] args) 
	{

		int arr[][] = new int[4][4];
		int sum=0;
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
			System.out.print(" ");
			}
				else
				{
					System.out.print(arr[i][j]);
					
					//if( i==1 && j==1 && i==1 && j==2 && i==2 && j==2 && i==2 && j==1)
		
					sum=sum+arr[i][j];
	           
	}
					
	}
			System.out.println();
		}
		
		System.out.print("addition of inner element from 2d array : " +sum);
		

	}

}
