/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;


public class FitnessTracker {

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		//System.out.print(calulateBMI(input));
		
		printSummery(input);
	}

	public static void printSummery(Scanner input)
	{
		System.out.println("your athleates Bmi is" + calulateBMI(input) + " and" + getBMICategory(calulateBMI(input)));
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
	
	public static String getBMICategory(double bmi)
	{
		String category ="";
		
		if (bmi < 18.5)
		{
			category = "you are underwaight.";
		}
		else if (bmi >= 18.5 && bmi < 25) 
		{
			category = "your waight is normal.";
		}
		else if (bmi >= 25 && bmi < 30) 
		{
			category = "you are overwaight.";
		}
		else
		{
			category = "you are obese.";
		}
		
		return category;
	}
	
	public static boolean askToContinue(Scanner input)
	{
		boolean answer = true;
		boolean track = true;
		char chosse =' ';
		do	
		{
			System.out.println("would you like to enter anuther athleate: enter Y/N.");
			chosse = input.next().charAt(0);
			if (chosse == 'Y' || chosse == 'N')
			{
				if (chosse == 'Y')
				{
					answer = true;
					
				}
				else
				{
					answer = false;
				}
				track = true;
			}
			else
			{
				track = false;
			}
		}
		while(!track);
		
		return answer;
	}
}

