package pac1;

import java.util.Scanner;

public class Lab9 {

	  
	public static String stringOperation(String str, int choice) {
	        if (choice == 1) {
	            return str + str;
	        } 
	        
	        else if (choice == 2)
	        {
	            String result = "";
	            for (int i = 0; i < str.length(); i++) {
	                if (i % 2 != 0) {
	                    result += "#";
	                } 
	                else 
	                {
	                    result += str.charAt(i);
	                }
	            }
	            return result;
	        }
	        
	        else if (choice == 3) {
	            String result = "";
	            for (int i = 0; i < str.length(); i++)
	            {
	                char ch = str.charAt(i);
	                if (result.indexOf(ch) == -1) 
	                {
	                    result += ch;
	                }
	            }
	            return result;
	        } 
	        else if (choice == 4) 
	        {
	            String result = "";
	            for (int i = 0; i < str.length(); i++) {
	                char ch = str.charAt(i);
	                if (i % 2 != 0) {
	                    result += Character.toUpperCase(ch);
	                } else {
	                    result += ch;
	                }
	            }
	            return result;
	        } 
	        else
	        {
	            return "Invalid choice";
	        }
	    }

	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        System.out.println("\nChoose an option:");
	        System.out.println("1. Add the string to itself");
	        System.out.println("2. Replace odd positions with '#'");
	        System.out.println("3. Remove duplicate characters");
	        System.out.println("4. Change odd characters to uppercase");

	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();

	        String result = stringOperation(str, choice);
	        System.out.println("Result is : " + result);
	    }
	}


