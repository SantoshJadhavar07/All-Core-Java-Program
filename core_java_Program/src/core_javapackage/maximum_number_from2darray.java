package core_javapackage;

public class maximum_number_from2darray {

	public static void main(String[] args)
	{
		int a[][]= {{21,13,23},{12,76,97}};
		
		int max=0;
		
		for(int i=0;i<a.length; i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				
			
			if(a[i][j] > max)
			{
				max=a[i][j];
			}
		}
	
		}
		
		System.out.println(max);

	}

	}


