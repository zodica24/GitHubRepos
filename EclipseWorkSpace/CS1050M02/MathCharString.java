/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class MathCharString 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("what is your name: ");
		
		String name = input.next();
		
		System.out.print("Plese enter a noun: ");
		 
		String noun = input.next();
		
		System.out.print("Plese enter a verb ending in ing: ");
		
		String verb = input.next();
		
		System.out.print("Plese enter a adjative: ");
		
		String adjative = input.next();
		
		System.out.print("Plese enter a place: ");
		
		String place =input.next();
		
		System.out.print("what is your last name ");
		
		char lastName = (char) input.next().charAt(0);
		
		System.out.print("Plese enter yor favorit letter: ");
		
		char favLetter = (char)input.next().charAt(0);
		
		System.out.print("Once upon a time, " + name + ". " + lastName + " was " + verb +" through the " + place + 
				" with a " + noun + " . It was a very " + adjative + " day. Their favorite letter was " + favLetter + ".” ");
		
		//String hiName = "Hello " + name + " " + lastName + ".";
		
		//char charTest = 'a';
		
		//int charAsciiValue = (int) charTest;
		
		//String firstName = name;
		
		//int stringLength = firstName.charAt(2);
		
		//int firstInitial = firstName.length();
		
		//char lastLetter = firstName.charAt(firstName.length() - 1);
		
		//System.out.print(lastLetter + "\n");
		
		
		
		//System.out.print(hiName);
		
		input.close();
	}

}
