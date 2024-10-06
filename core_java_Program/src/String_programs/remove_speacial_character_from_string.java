package String_programs;

public class remove_speacial_character_from_string {

	public static void main(String[] args)
	{
		String s="for@tune*cl&oud";
		
		String s1=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s1);

	}

}
