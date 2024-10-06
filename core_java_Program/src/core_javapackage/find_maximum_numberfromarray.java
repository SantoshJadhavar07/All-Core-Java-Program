package core_javapackage;

public class find_maximum_numberfromarray {

	public static void main(String[] args) 
	
	{
		int array[]={25,87,61,98};
		int max=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println(max);

	}

}
