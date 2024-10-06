package core_javapackage;
import java.util.Scanner;

public class checkposnegnumber {
 public static void main(String[] args) {
	
	 int num;
	 System.out.println("enter any number:");
	 
	
		Scanner ab=new Scanner(System.in);
		 num=ab.nextInt();
		 
		 if(num > 0 )
		 {
			System.out.println("positive number");
		 }

			else if(num==0)
				{
					System.out.println("zero");
				}
		 else
		 {
				System.out.println("negative number");
			 }
}
}
