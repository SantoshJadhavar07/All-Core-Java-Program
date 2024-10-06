package patttern_corejava;

public class star_and_hash_pattern {

	public static void main(String[] args) 
	{
	
    int i,j;
    
    for(i=0;i<3;i++)
    {
    	for(j=0;j<3;j++)
    	{
    		if(i==1)
    		{
    		System.out.print("#");
    		}
    		else
    		{
    			System.out.print("*");
    		}
    	}
    	System.out.println();
    }
	}

}
