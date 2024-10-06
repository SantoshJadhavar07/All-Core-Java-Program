package core_javapackage;

public class print_odd_number_count_fromarray {

	public static void main(String[] args) 
	
	{
		int array[]= {2,10,5,12,8};
		int count=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2!=0)
			{
				
				System.out.println("odd number is :"+array[i]);
				count++;
				
			}
		}
		System.out.println("odd number count is :"+count);

	}

}
