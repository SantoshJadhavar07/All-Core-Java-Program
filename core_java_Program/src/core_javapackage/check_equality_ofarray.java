package core_javapackage;
import java.util.*;

public class check_equality_ofarray {
	 
	public static void main(String[] args)
	{
     
      int farray;
      int sarray;
      int count=0;
      Scanner s1=new Scanner(System.in);
      System.out.println("enter the length of first array");
      farray=s1.nextInt();
      System.out.println("enter the length of second array");
      sarray=s1.nextInt();
      
      int a[] = new int[farray];
      int b[] = new int[sarray];
      
      if(farray==sarray)
      {
    	  System.out.println("array are equal in length");
    	 
    	  System.out.println("enter elements of firs array");
    	  for(int i=0;i<a.length;i++)

    		  {
    		  a[i]=s1.nextInt();
    		  
    		  }
   
    	  System.out.println("enter elements of second array");
    	  for(int i=0;i<b.length;i++)
    	  {
    	  b[i]=s1.nextInt();
    	  }
    	
    	  for(int i=0;i<a.length;i++)
    	  {
    		  if(a[i]==b[i])
    		  {
    			  count++;
    		  }
    		 
    	  }
    	  if(count != 0)
		  {
			  System.out.println("both array are not equals");
		  }
		  else
		  {
			  System.out.println("both array are  equals");
		  }
      }
      else
      {
    	  System.out.println("array are not equal in length");
    	  System.out.println("thank you");
      }
	}

}
