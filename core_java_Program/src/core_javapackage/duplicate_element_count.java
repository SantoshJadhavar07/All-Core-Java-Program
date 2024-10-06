package core_javapackage;

public class duplicate_element_count {

	public static void main(String[] args)
	{
		int array[]= {10,5,10,28,19};
		int num=10;
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
				count++;
			}
		}
		System.out.println("duplicate value count is " +count);

	}

}
