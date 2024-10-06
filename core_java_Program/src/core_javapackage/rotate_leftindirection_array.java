package core_javapackage;

import java.util.Arrays;

public class rotate_leftindirection_array {

	public static void main(String[]args)
	{
		int a[]= {1,2,3,4,5};
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		
		}
		
			a[4]=temp;
		System.out.print(Arrays.toString(a));
		}
		
	}
	

