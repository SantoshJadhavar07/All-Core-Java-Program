package core_javapackage;

import java.util.Scanner;

public class insertation_sort_method {

	public static void main(String[] args) 
	
	{
		int n,key,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		  n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the array elements");
		for( i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		for( i=0;i<n;i++)
			
		{
			key=a[i];
			for(j=i-1;j>=0 && a[j]>key;j--)
			{
				a[j+1]=a[j];
			}
			  a[j+1]=key;
		}
		System.out.println("sorted array is :");
		for( i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
		}


	}

}
