package core_javapackage;
import java.util.*;

public class switch_case_for_atm {

	public static void main(String []args)
	{
		int a, b, result;
		int ch;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value for A :");
		a=s1.nextInt();
		 System.out.println("Enter value for B :");
		 b=s1.nextInt();
		 
		 System.out.println("1 for Addition: ");
		 System.out.println("2 for Substraction: ");
		 System.out.println("3 for Multiplication: ");
		 System.out.println("4 for Division: ");
		 System.out.println("Enter your choice: ");
		 ch=s1.nextInt();
		 
		 
		 
		switch(ch)
		{
		
	
	case 1:
			result = a + b;
			System.out.println("Addition:" +result);
			break;
		
   case 2:
		result = a - b;
		System.out.println("Substraction:" +result);
		break;
	
   case 3:
	result = a * b;
	System.out.println("Multiplication:" +result);
	break;

  case 4:
	result = a / b;
	System.out.println("Division:" +result);
	break;
	
  default:
	
	System.out.println("invalid choice");
		}
	}
}
		
	