package core_javapackage;
import java.util.Scanner;

public class merge_sort
{
	

static Scanner sc=new Scanner(System.in);
static void accept_array(int a[],int n)
{
	for(int i=0;i<n;i++)
	{
		System.out.println("enter elements");
		a[i]=sc.nextInt();
	}
}
static void display(int a[],int n)
{

	System.out.println("array is:");
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
}
static void merge(int a[],int si,int ei, int mid)
{
	int temp[]=new int[80];
	int i,j,k;
	i=si;
	j=mid+1;
	k=0;
	
	while(i<=mid&&j<=ei)
	{
		
while (i<=mid&&j<=ei)
	{
		if(a[i]<a[j])
		{
			temp[k]=a[i];
			i++;
			k++;
		}
		else {
			temp[k]=a[j];
			j++;
			k++;
		}
	}
	k=0;
	while(i<=mid)//0<=2
	{
		temp[k++]=a[i++];//temp[1]=a[1]
	}
	while(j<=ei)
	{
		temp[k++]=a[j++];
	}

	}
	}
	

	public static void main(String[] args) 
	{
		
		merge_sort sc=new merge_sort();
	      sc.accept_array(null,0);
	      sc.display(null, 0);
	      sc.merge(null, 0, 0, 0);
		
	}
	}
	
	




