import java.util.Scanner;

/**
 * @author Timothy Fierek
 * 
 * password.java accepts user input in the form of a potential "password".
 * The password must contain at least one lower case and one upper case letter,
 * between 7 and 12 characters, and the '!' character. Prints either:
 * "Password valid and accepted" or "Error" depending on the input password.
 *
 */
public class Password {

	/**
	 * 
	 * Main method collects 
	 */
	public static void main(String[] args) {

		// Create scanner, prompt and collect user input, close scanner
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a password: ");
		String pw = in.nextLine();
		in.close();
		
		// Booleans to store the various password requirements for the input password
		boolean correctLength = checkLength(pw);
		boolean hasLowerCase = hasLowerCase(pw);
		boolean hasUpperCase = hasUpperCase(pw);
		boolean hasExclamation = hasExclamation(pw);
		
		// Print output after determining if password meets requirements
		if(correctLength && hasLowerCase && hasUpperCase && hasExclamation) {
			System.out.println("Password valid and accepted");
		}
		else {
			System.out.println("Error");
		}
		
	}
	
	/**
	 * A separate method for checking length allows for easy adjustment of the length parameters of the input password.
	 * 
	 * @param str String to be checked for correct length parameters
	 * @return return true if the length of str is between 7 and 12 inclusive, false otherwise
	 */
	public static boolean checkLength(String str) {
		return (str.length() >= 7 && str.length() <= 12);
	}
	
	/**
	 * A separate method for checking for upper case characters allows for the upper case requirement to be used or omitted 
	 * in  case of changing the parameters for a correct password.
	 * 
	 * @param str String to be checked for upper case characters
	 * @return return true if str contains at least one upper case letter, false otherwise
	 */
	public static boolean hasUpperCase(String str) {
		char cur;
		for(int i = 0; i < str.length() - 1; i++) {
			cur = str.charAt(i);
			if(Character.isUpperCase(cur)) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * A separate method for checking for lower case characters allows for the lower case requirement to be used or omitted 
	 * in  case of changing the parameters for a correct password.
	 * 
	 * @param str String to be checked for lower case characters
	 * @return returns true if str contains at least one lower case letter, false otherwise
	 */
	public static boolean hasLowerCase(String str) {
		char cur;
		for(int i = 0; i < str.length() - 1; i++) {
			cur = str.charAt(i);
			if(Character.isLowerCase(cur)) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 
	 * @param str String to be checked
	 * @return returns true if str contains a '!' inside of it at any position, false otherwise
	 */
	public static boolean hasExclamation(String str) {
		return (str.indexOf("!") != -1);
	}

}
