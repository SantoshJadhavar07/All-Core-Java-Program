package core_javapackage;
import java.util.*;
public class two_diamension_array {

	public static void main(String[] args)
	{
		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		int c[][] = new int [3][3];
		int i,j;
		Scanner s1=new Scanner (System.in);
		System.out.println("enter array element of A");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=s1.nextInt();
			}
		}
		
		System.out.println("enter array element of B");

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=s1.nextInt();
			}
		}
		System.out.println("Addition of A and B matrix is :");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
