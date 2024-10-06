package core_javapackage;

import java.util.Scanner;

public class string_pallindrome {

	public static void main(String[] args)
	{
	
	        Scanner s1 = new Scanner(System.in);
	        System.out.println("Enter any string:");
	        String original = s1.nextLine();
	        
	      
	        String cleanedOriginal = original.replaceAll("\\s", "").toLowerCase();
	        String reversed = "";

	        // Reverse the cleaned string
	        for (int i = cleanedOriginal.length() - 1; i >= 0; i--) {
	            reversed += cleanedOriginal.charAt(i);
	        }

	        System.out.println("Reversed string: " + reversed);

	        // Check if the cleaned original string is equal to the reversed string
	        if (cleanedOriginal.equals(reversed)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        s1.close();
	    }
	

}



