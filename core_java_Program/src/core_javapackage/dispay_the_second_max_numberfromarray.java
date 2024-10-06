package core_javapackage;

public class dispay_the_second_max_numberfromarray {

	public static void main(String[] args)
	
	{
		
		int a[]= new int[5];
		a[0]=10;
		a[1]=13;
		a[2]=15;
		a[3]=17;
		a[4]=19;
		int  secmax=0;
		int max=0;
		
		for(int i=0;i<5;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("maximum number is : "+max);
		
		for(int j=0;j<5;j++)
		{
			if(secmax < a[j] && a[j] != max)
			{
				secmax=a[j];
			}
		}
		System.out.println("second maximum number is :" +secmax);
		
	}

}
