package String_programs;

class santosh
{
	void first()
	{
		String s = "You all are very very good students";
		String ns="";
		String strarr[]=s.split(" ");
		for(int i=strarr.length-1;i>=0;i--)
		{
			ns=ns+strarr[i]+" ";
		}
		System.out.println(ns);
		
	}
	
	void second()
	{
		String s = "You all are very very good students";
		String ns=" ";
		String strarr[]=s.split(" ");
		for(int i=0;i<strarr.length;i++)
		{
			String word = strarr[i];
			String revword=" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				revword = revword + word.charAt(j);
			}
			ns = ns + revword+" ";
		}
		System.out.println(ns);
	}
	
	void third()
	{
		String s = "You all are very very good students";
		String ns ="";
		String rev="";
		String strarr[]=s.split(" ");
		for(int i=0;i<=strarr.length-1;i++)
		{
			ns=ns+strarr[i]+" ";
			
		}
		for(int j=ns.length()-1;j>=0;j--)
		{
			rev = rev + ns.charAt(j);
		}
		
		System.out.println(rev);
		
	}

}
public class reverse_all_string {

	public static void main(String[] args)
	{
		santosh s1=new santosh();
		s1.first();
		s1.second();
		s1.third();
	}

}
