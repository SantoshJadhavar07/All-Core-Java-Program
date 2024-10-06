package core_javapackage;

public class third_maximum_no {

	public static void main(String[] args)
	{


		int array[]={25,87,61,98};
		int max=0;
		int smax=0;
		int tmax=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("maximum number is:"+max);

	
	
	
	for(int j=0;j<array.length;j++)
	{
		if(array[j]>smax && array[j] != max)
		{
			smax=array[j];
		}
		
	}
	System.out.println( "second maximum number is :" +smax);
	
	for(int k=0;k<array.length;k++)
	{
		if(array[k] > tmax && array[k] != smax && array[k] != max)
		{
			tmax=array[k];
		}
		
	}
	System.out.println( "third maximum number is :" +tmax);
	
	

}
}
