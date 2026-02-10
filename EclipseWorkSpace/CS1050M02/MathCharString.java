/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class MathCharString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Math.random();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("what is your name \n");
		
		String name = input.next();
		
		System.out.print("what is your last initial \n");
		
		char lastInitial = (char) input.next().charAt(0);
		
		String hiName = "Hello " + name + " " + lastInitial + ".";
		
		char charTest = 'a';
		
		int charAsciiValue = (int) charTest;
		
		String firstName = name;
		
		int stringLength = firstName.charAt(2);
		
		int firstInitial = firstName.length();
		
		char lastLetter = firstName.charAt(firstName.length() - 1);
		
		System.out.print(lastLetter + "\n");
		
		
		
		System.out.print(hiName);
		
		
	}

}
