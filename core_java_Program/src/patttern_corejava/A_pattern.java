package patttern_corejava;

public class A_pattern {

	public static void main(String[] args)
	{

     for(int i=0; i<=4;i++)
     {
    	 for(int j=0;j<=7;j++)
    	 {
    		 if(i==1 && j==4 || i==2 && j==3 || i==2 && j==5 || i==3 && j==2 || i==3 && j==6 || i==4 && j==1 || i==4 && j==7 || i==3 && j==4)
    		 {
    		 System.out.print("*");
    		 
    		 }
    		 else
    		 {
    			 System.out.print(" ");
    		 }
    	 }
    	 System.out.println();
     }

	}

}
