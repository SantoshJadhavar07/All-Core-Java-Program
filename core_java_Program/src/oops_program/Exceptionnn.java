package oops_program;

interface   Rvd {
	 
	abstract void a();
	
	default void b() {
		System.out.println("-----------------");
		
	}
	private void c() {
		System.out.println("-----------------");

		
	}
	static void n() {
		System.out.println("-----------------");

		
	}
	 
	
}
 class Abs implements Rvd{
      public  void a() {
		System.out.println("AAAAAAAAAAA");
	}
	
}
public class Exceptionnn {
	public static void main(String[] args) 
	{
		Rvd.n();
		
		
		Abs s = new Abs(); 
		s.a();
		s.b();
		


	}

}
