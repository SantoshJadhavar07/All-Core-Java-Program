package core_javapackage;

public class print_even_number_fromarray {

	public static void main(String[] args)
	
	{
		int array[]= {2,10,5,12,8};
		int count=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				
				System.out.println("even number is :"+array[i]);
				count++;
				
			}
		}
		System.out.println("even number count is :"+count);
	}

}
