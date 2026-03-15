/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;


public class FitnessTracker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		//System.out.print(calulateBMI(input));
		printSummery(input);
	}

	public static void printSummery(Scanner input)
	{
		System.out.println("your athleates" + calulateBMI(input) + "is and thay are under waight over waight.");
	}
	
	public static double getPositiveDouble(Scanner input, String questionPrompt)
	{
		double number = 0;
		boolean track = true;
		do {
			System.out.println(questionPrompt);
			number = input.nextDouble();
			if(number > 0)
			{
				System.out.println("Number is valid"); 
				track = false;
			}
			else
			{
				System.out.println("Number is invalid"); 
				track = true;
			}
		}
		while(track);
		
		return number;
	}
	
	public static double calulateBMI(Scanner input) 
	{
		double bmi = 0;
		double height = 0;
		double weight = 0;
		final int bmiNumber = 703;
		
				System.out.println("Enter your weight, in pounds: ");
				
				weight = getPositiveDouble(input,"plese input a postive number");;
				
				System.out.println("Enter your height, in inches: ");
				
				height = getPositiveDouble(input,"plese input a postive number");;
				
				bmi = weight * bmiNumber / (height * height);
		
		return bmi;
	}
	
}

