package core_javapackage;

public class addition_of_largestnumber_fromarray {

	public static void main(String[] args)
	{

		int a[]= new int[5];
		a[0]=10;
		a[1]=13;
		a[2]=15;
		a[3]=17;
		a[4]=19;
		int  addition, firstnum, secnum;
		int max=0;
		
		for(int i=0;i<5;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("sum of maximum numbers : "+max);
		
		firstnum=max/10;
		secnum=max%10;
		
		System.out.println(firstnum+secnum);
	}

}
