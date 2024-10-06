package core_javapackage;

public class find_minimun_element_fromarray {

	public static void main(String[] args) 
	
	{

		int array[]={25,87,61,98};
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i] < min)
			{
				min=array[i];
			}
		}
		System.out.println(min);

	

	}

}
