package pac1;

public class Lab10 {



	    public static boolean isPositiveString(String str)
	    {  
         for (int i = 0; i < str.length() - 1; i++) {
	            if (str.charAt(i) > str.charAt(i + 1)) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	   
	        String word1 = "ANT";
	        String word2 = "DOG";

	        System.out.println(word1 + " is positive "  + isPositiveString(word1)); 
	        System.out.println(word2 + " is positive " + isPositiveString(word2)); 
	    }
	}


