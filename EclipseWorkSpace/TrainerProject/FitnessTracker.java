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
		double hight = 0;
		double waight = 0;
		double bmi = 0;
		String category = "";
		Scanner input = new Scanner(System.in);
		boolean track = askToContinue(input);
		do
		{
			
			waight = getPositiveDouble(input,"Enter your weight, in pounds: ");
					
			hight = getPositiveDouble(input,"Enter your height, in inches: ");
			
			bmi = calulateBMI(hight,waight);
			
			category = getBMICategory(bmi);
			
			printSummery(bmi,category);
			
			track = askToContinue(input);
		}
		while(track);
		
	}

	public static void printSummery(double bmi, String bmiCat)
	{
		
		System.out.println("your athleates Bmi is " + bmi + " and " + bmiCat);
	}
	
	public static double getPositiveDouble(Scanner input, String questionPrompt)
	{
		double number = 0;
		boolean track = false;
		while(!track) {
			System.out.println(questionPrompt);
			if (input.hasNextDouble())
			{
				number = input.nextDouble();
				
				if(number > 0)
				{ 
					track = true;
				}
				else
				{ 
					System.out.println("you didnt enter a postive number.");
				}
			}
			else 
			{
				System.out.println("input is not a intager");
				input.nextLine();
			}
		}
		
		
		return number;
	}
	
	public static double calulateBMI(double hight, double waight) 
	{
		double bmi = 0;
		final int bmiNumber = 703;
		
				
		bmi = waight * bmiNumber / (hight * hight);
		
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
			chosse = Character.toUpperCase(input.next().charAt(0));
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

