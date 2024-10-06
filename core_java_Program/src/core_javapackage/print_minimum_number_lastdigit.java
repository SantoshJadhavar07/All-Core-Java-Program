package core_javapackage;

public class print_minimum_number_lastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

			int a[]= new int[5];
			a[0]=14;
			a[1]=18;
			a[2]=15;
			a[3]=17;
			a[4]=19;
		
			int min=a[0];
			
			for(int i=0;i<5;i++)
			{  
				
				if(a[i] < min)
				{
					min=a[i];
				}
			}
			System.out.println("minimum numbers : "+min);
			
			min=min%10;
			
			System.out.println("minimum number last digit :"+min);
	}

}
