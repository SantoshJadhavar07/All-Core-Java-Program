package core_javapackage;

import java.util.*;
public class table_print {

	public static void main(String[] args) {
		
		int num;
		int table;
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any number");
		num=s1.nextInt();
		for(int i=1;i<=10;i++)
		{
			table = num * i;
			System.out.println(table);
		}

	}

}
