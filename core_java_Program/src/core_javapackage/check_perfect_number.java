package core_javapackage;
//perfect number=sum of its divisors is equal to number itself
public class check_perfect_number {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int num=6;
		int sum=0;
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		if(sum==num)
		{
		System.out.println(sum+ ":  is perfect number");
		}
		else
			System.out.println(sum+ " is not perfect number");

	}

}
