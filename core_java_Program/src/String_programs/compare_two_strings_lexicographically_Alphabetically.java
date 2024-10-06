package String_programs;

public class compare_two_strings_lexicographically_Alphabetically {

	public static void main(String[] args) 
	{
		String s1="bat";
		String s2="Bat";
		
		int num = s1.compareTo(s2);
		if(num==0)
		{
			System.out.println(s1 +"&"+s2 +" is equal");
		}
		else if(num<0)
		{
			System.out.println(s1 +" is less than "+ s2);
			
		}
		else
		{
			System.out.println(s2 +" is less than "+  s1);
		}
			}

}
