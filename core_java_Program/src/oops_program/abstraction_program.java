package oops_program;




abstract class tata
{
	abstract void selling();
	
	abstract void manufacture();
	
	abstract void buy();
	
	 final void rules()
	{
		System.out.println("every employee must be educated:");
		System.out.println("saturday & sunday comman off for each and every empoyee");
		System.out.println("manufacturing cost should be basis on market valaue of that software");
	}
	
}

class tcs extends tata
{

	@Override
	void selling() {
		
		System.out.println("selling  the software cost is : 1000k");
	}

	@Override
	void manufacture() {
		
		System.out.println("manufacturin cost is : 600k");
	}

	@Override
	void buy() 
	{
       System.out.println("buying row material value is : 500k");

	}
	
}

class tatamoters extends tata
{

	@Override
	void selling() {
		System.out.println("selling  the car in year : 1000");
		
	}

	@Override
	void manufacture() {
		
		System.out.println("manufacturing cost is : 600k");
	}

	@Override
	void buy() {

		System.out.println("buying row material for car manufacturin value is : 500k");
		
	}
	
}
class tatasteel extends tata
{

	@Override
	void selling() {
		System.out.println("selling  the steel in year : 1000");
		
	}

	@Override
	void manufacture() {
		System.out.println("manufacturing cost is : 600k");
	
		
	}

	@Override
	void buy() {
		System.out.println("buying row material for steel manufacturin value is : 500k");
		
		
	}
	
}
public class abstraction_program

{

	public static void main(String[] args) 
	
	{
	
		tatamoters s1=new tatamoters();
		s1.rules();
		s1.buy();
		s1.manufacture();
		s1.selling();
		
		tatasteel s2=new tatasteel();
		s2.rules();
		s2.buy();
		s2.manufacture();
		s2.selling();
		
	}

}
