package core_javapackage;

public class find_duplicate_element_fromarray
{

	public static void main(String[] args)
	{
		int a[]= {1,5,6,1,4};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{//j=0   0<0
				//j=0   0<1
				//j=0   0<2
				if(a[i]==a[j])
				{
					count++;
					System.out.println(a[i]);
					
				}
			}
			
		}
		System.out.println("count is :"+count);
	}

}
