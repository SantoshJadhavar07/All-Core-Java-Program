package core_javapackage;



public class separate_oddnadeven_element_fromarray {

	public static void main(String[] args)
	{
		int a[]= {4,13,9,18,5,16};
		int even[] =new int[a.length];
		int odd[] = new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[i]=a[i];
			
				
			}
	
			else
			{
			 odd[i]=a[i];
	
		}
	}
		for(int j=0;j<even.length;j++)
		{
			System.out.print(even[j]);
		}
		System.out.println();
		
		for(int k=0;k<odd.length;k++)
		{
			System.out.print(odd[k]);
		}
		System.out.println();
		for(int n=0;n<even.length;n++)
		{
			if(even[n] != 0)
			{
				System.out.print(even[n]);
			}
		}
		System.out.println();
		for(int n=0;n<even.length;n++)
		{
			if(odd[n] != 0)
			{
				System.out.print(odd[n]);
			}
		}
}
}
