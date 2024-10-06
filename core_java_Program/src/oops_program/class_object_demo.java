package oops_program;

class loops{
	 
	void ifelse()
	{
		int a=1;
		if(a==1)
		{
			System.out.println("jay shree ram");
		}
		else
		{
			System.out.println("jay shree krishn");
		}
	}
	void elseif()
    {
		int a=2;
		if(a==1)
		{
			System.out.println("jay shree ram");
		}
		else if(a==2)
		{
			System.out.println("jay shree krishn");
		}
		else
		{
			System.out.println("jay jagannath");
		}
		
     }
	void switchcase()
	{
	int a=2;
	  switch(a)
	  {
	  case 1:
		  System.out.println("jay shree ram");
		  break;
	  case 2:
		  System.out.println("jay hanuman");
		  break;
		  default:
			  System.out.println("invalid");
	  }
	}
	void forloop()
	{

		for(int i=1;i<=10;i++)
		{
			System.out.println("jay shree krishn");
		}
		
	}
	void whileloop()
	{
		int i=1;
		while(i<=10)
		{
			System.out.println("jay shree ram");
			i++;
		}
	}
	void dowhile()
	{
		int i=1;
		do
		{
			System.out.println("jay hanuman");
			i++;
		}while(i<=10);
	}
}




public class class_object_demo {

	public static void main(String[] args)
	{
		loops s1=new loops();
		s1.ifelse();
		s1.elseif();
		s1.switchcase();
		s1.forloop();
		s1.whileloop();
		s1.dowhile();
				
	}

}
