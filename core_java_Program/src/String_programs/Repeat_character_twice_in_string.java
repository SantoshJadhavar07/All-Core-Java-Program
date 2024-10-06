package String_programs;

public class Repeat_character_twice_in_string {

	public static void main(String[] args) 
	{
		String str="cravita";
		String new_str="";
		
		for(int i=0;i<str.length();i++)
		{
			new_str += str.substring(i,i+1) + str.substring(i,i+1);
			
		}
		System.out.println(new_str);
	}

}
