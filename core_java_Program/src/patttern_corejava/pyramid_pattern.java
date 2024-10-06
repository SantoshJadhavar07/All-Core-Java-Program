package patttern_corejava;
import java.util.*;
public class pyramid_pattern {

	public static void main(String[] args)
	{
		int i,j,k;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter rows for pyramid");
		int num=s1.nextInt();
		for(i=1;i<num;i++)
		{
			for(j=num;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		
	}

}
