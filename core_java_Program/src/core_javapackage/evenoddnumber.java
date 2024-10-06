package core_javapackage;
import java.util.Scanner;

public class evenoddnumber {
 public static void main(String[] args) {
	
	 int num;
	 System.out.println("enter any number:");
	 
	
		Scanner ab=new Scanner(System.in);
		 num=ab.nextInt();
		 
		 if(num%2 == 0 )
		 {
			System.out.println("even number");
		 }
		 else
		 {
				System.out.println("odd number");
			 }
}
}