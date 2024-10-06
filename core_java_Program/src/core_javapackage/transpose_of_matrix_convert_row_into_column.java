package core_javapackage;

public class transpose_of_matrix_convert_row_into_column 
{

	public static void main(String[] args) 
	{
		int a[][]= {{1,4,6},{2,9,7},{8,3,5}};
		

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("*******************");
		int q[][]=new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				
				q[j][i]=a[i][j];
			}
			System.out.println();
		}
		
		System.out.println("*******************");
		for(int i=0;i<q.length;i++)
		{
			for(int j=0;j<q.length;j++)
			{
			System.out.print(q[i][j]+" ");
			}
			System.out.println();
		}
	}

}
