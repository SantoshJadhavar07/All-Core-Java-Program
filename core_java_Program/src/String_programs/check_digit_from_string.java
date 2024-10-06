package String_programs;

public class check_digit_from_string {

	public static void main(String[] args)
	{
		String s="hjhs3424dh";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)<= '9' && s.charAt(i)>= '0')
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("digit are not present:");
		}
		else
		{
			System.out.println("digit are present:");
		}

	}

}
