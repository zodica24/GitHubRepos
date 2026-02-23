/**
 * Calculate the BMI using formula in US units. 
 * User will enter weight in pounds and height in inches
 */

// ADD CODE to import Scanner class
import java.util.Scanner;

public class BodyMassIndexActivity
{

	public static void main(String[] args)
	{
		//Create constand an variables
		final int bmiNumber = 703;
		// constants
		 // factor formula in pounds
		double weight = 0;
		
		double height = 0;
		
		double bmi = 0;
		// Variables
		// The user's weight
		// The user's height
		 // The user's BMI

		// Create a Scanner object for scanning input from keyboard
		Scanner input = new Scanner(System.in);

		// Tell the user what the program will do.
		System.out.println("This program will calculate your " + "body mass index, or BMI.");
		
		
		// Get the user's weight.
		System.out.print("Enter your weight, in pounds: ");
		// ADD CODE to input next double for weight
		weight = input.nextDouble();
		// Get the user's height.
		System.out.print("Enter your height, in inches: ");
		// ADD CODE input next double for height
		height = input.nextDouble();
		// Calculate the user's body mass index.
		bmi = weight * bmiNumber / (height * height);

		// Display the user's BMI.
		System.out.printf("Your body mass index (BMI) is %f", bmi + "n/");
		
		if (bmi < 18.5)
		{
			System.out.print("You are underweight.");
		}
		else if (bmi >= 18.5 && bmi < 25) 
		{
			System.out.print("You are normal.");
		}
		else if (bmi >= 25 && bmi < 30) 
		{
			System.out.print("You are overweight.");
		}
		else
		{
			System.out.print("you are obese");
		}
		
		input.close();

	}
}