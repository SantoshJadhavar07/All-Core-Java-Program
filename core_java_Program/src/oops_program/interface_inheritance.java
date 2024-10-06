package oops_program;


interface add
{
	void addi();	
}
interface subs
{
	void subst();
}
interface mult
{
	void multi();
}
interface div
{
	void divi();
}

class cal implements add, subs, mult, div

{
	
	int a=10;
	int b=10;
	int c;
	@Override
	public void addi() {
		c=a+b;
		System.out.println("addition :" +c);
		
	}

	@Override
	public void subst() {
		c=a-b;
		System.out.println("substraction :" +c);
		
	}

	@Override
	public void multi() {
		c=a*b;
		System.out.println("multiplication :" +c);
		
	}

	@Override
	public void divi() {
		c=a/b;
		System.out.println("division :" +c);
	}

	
}

public class interface_inheritance
{

	public static void main(String[] args)
	
	{
		cal s1=new cal();
		s1.addi();
		s1.subst();
		s1.multi();
		s1.divi();
	}

}


