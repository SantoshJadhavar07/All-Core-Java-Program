package String_programs;

public class find_duplicate_character {

	public static void main(String[] args)
	{
		String s="santosh";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				count++;
				
			}
			
			
		}
		if(count==0)
		{
			System.out.println("duplicate character not present:" +count);
		}
		else
		{
			System.out.println("duplicate character is present:" +count);
		}
	}

}
