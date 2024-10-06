package core_javapackage;

public class find_duplicate_number_count {

	public static void main(String[] args)
	{

		int array[]= {2,10,5,10,8};
		int count=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==array[i])
			{
				count++;
			
				System.out.println(count);
			}
		}
		if(count==0)
		{
			System.out.println(count+" is not present");
		}
		else
		{
			
		System.out.println(count+" is present");
		}

	
	}

}
