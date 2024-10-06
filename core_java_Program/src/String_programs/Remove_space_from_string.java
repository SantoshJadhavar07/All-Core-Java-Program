package String_programs;

public class Remove_space_from_string {

	public static void main(String[] args) 
	{
		String s="f o r t u n e";
		String s2 = s.replaceAll("\\s", "");
		
		System.out.println(s2);

	}

}
