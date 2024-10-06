package core_javapackage;

//divisible by one or itself is called prime numbers
public class check_prime_number {

	public static void main(String[] args) {
		
		int num=17;
		int flag=0;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag=1;
				
			}
		}
		if(flag==0)
		{
			System.out.println(num+ " is the prime numbers");
		}
		else
			System.out.println(num+ " is not a prime numbers");

	}

}
