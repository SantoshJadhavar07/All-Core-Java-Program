package patttern_corejava;

public class leftangle_triangle_withnumber {

	public static void main(String[] args) 
	
	{

		
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
//				if(k==1)
//				{
//				System.out.print("4");
//				}
//				else if(k==2)
//				{
//					System.out.print("3");
//				}
//				else if(k==3)
//				{
//					System.out.print("2");
//				}
//				else
//				{
//					System.out.print("1");
//				}
				System.out.print(k);
			
			}
			System.out.println();
		}
	}

}
			
