package core_javapackage;
import java.util.*;
public class selection_sort_method {

	public static void main(String[] args) 
	{
		
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		  n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("sorted array is :");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
		}

	}

}
