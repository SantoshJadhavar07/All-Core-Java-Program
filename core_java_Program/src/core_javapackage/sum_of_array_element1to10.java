package core_javapackage;

public class sum_of_array_element1to10 {

	public static void main(String[] args) 
	{
		int a[]= new int[5];
		a[0]=1;
		a[1]=5;
		a[2]=10;
		a[3]=5;
		a[4]=10;
		int sum=0;
		
		
		for(int i=0; i<5; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
