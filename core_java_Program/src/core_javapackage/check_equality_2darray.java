package core_javapackage;


public class check_equality_2darray {

	public static void main(String[] args) 
	{
int a[]= {21,13,23};
		int ar[]={12,76,97};
		
		int count=0;
		
		for(int i=0;i<a.length; i++)
		{
			
			for(int j=0;j<i;j++)
			{
				
			if(a[i] == ar[j])
			{
				count++;
			}
		}
	
		}
		if(count==0)
		{
			System.out.println("array is not a same");
		}
		else
		{
			System.out.println("array is a same");
		}
	}

}
