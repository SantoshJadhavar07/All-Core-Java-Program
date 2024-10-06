package core_javapackage;

public class check_number_from_arrayelement {

	public static void main(String[] args)
	
	{
		int array[]= {8,97,67,45,34};
		int count=0;
		int number=34;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==number)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(number+" is not present");
		}
		else
		{
			
		System.out.println(number+" is present");
		}

	}

}
