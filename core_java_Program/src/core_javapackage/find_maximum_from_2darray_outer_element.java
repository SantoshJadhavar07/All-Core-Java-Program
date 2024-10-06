package core_javapackage;

import java.util.Scanner;

public class find_maximum_from_2darray_outer_element {

	public static void main(String[] args) 
	
	{
		int arr[][] = new int[4][4];
		int max=0;
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
			
			if(arr[i][j] > max)
			{
				max=arr[i][j];
			}

			}
				else
				{
					System.out.print(" ");
					
					//if( i==1 && j==1 && i==1 && j==2 && i==2 && j==2 && i==2 && j==1)
	           
	}
					
				
			}
			System.out.println();
		}
		
		System.out.print("maximum element from 2d array : " +max);
		

	}

}
