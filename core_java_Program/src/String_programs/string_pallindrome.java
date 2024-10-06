package String_programs;

public class string_pallindrome {

	public static void main(String[] args)
	{
		String st="madam";
		String rev="";
		for(int i=0;i<st.length();i++)
		{
			rev=st.charAt(i)+rev;
		}
		if(st.equals(rev))
		{
			System.out.println("pallindrome String");
		}
		else
		{
			System.out.println("not pallindrome String");
		}
	}

}
