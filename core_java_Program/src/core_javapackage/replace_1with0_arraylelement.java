package core_javapackage;

import java.util.Arrays;

public class replace_1with0_arraylelement {

	public static void main(String[] args)
	{
		
		int a[]	= {1,0,1,0,1,0,0};
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				System.out.print("1");
			}
			else
			{
				System.out.print("0");
			}
			}
		
		
			System.out.println(Arrays.toString(a));
			
		}

	}


