package String_programs;

public class remove_duplicate_character_from_string {

	public static void main(String[] args) 
	{
		
		String str="ballbat";
		String new_str="";
		int count;
		
		for(int i=0;i<str.length();i++)
			{
			  count=0;
			for(int j=0;j<i;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
					break;
				}
				
			}
			if(count==0)
			{
				new_str=new_str+str.charAt(i);
			}
			
		}
		System.out.println(new_str);
}

}
