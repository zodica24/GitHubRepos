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
		Scanner input = new Scanner(System.in);
		int hold = getPositiveInt(input,"plese enter number of alathleates: ");
		double [] bmi = new double[hold];
		String [] names = new String[hold];
		int [] heartRates = new int[hold];
		
		getInfo(bmi,names,heartRates,input);
		printSummery(bmi, names, heartRates);
			 
}
	public static int getMaxHeartRate(int age) {
		int heartRates = 220 - age;
		
		return heartRates;
	}
	
	public static void getInfo(double [] bmi, String [] names, int [] heartRates, Scanner input) {
		
		double hight = 0;
		double waight = 0;
		int age = 0;
		
		int hold = getPositiveInt(input,"plese enter number of alathleates: ");
		
		names = new String[hold];
		bmi = new double[hold];
		heartRates = new int[hold];
		
		for(int i = 0; i < bmi.length; i++) {
			System.out.println("enter athleates name: ");
			names[i] = input.next();
			hight = getPositiveDouble(input,"enter athleates hight:");
			waight = getPositiveDouble(input,"enter athleates whight:");
			bmi[i] = calulateBMI(hight,waight);
			age = getPositiveInt(input,"enter athleates age: ");
			heartRates[i] = getMaxHeartRate(age);
		}
		
		return;
	}

	public static void printSummery(double [] bmi, String [] names, int [] heartRate)
	{
		
		System.out.println("============Athleate Summry=========");
		for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
				System.out.println("BMI: " + bmi[i]);
				System.out.println("Catgory: " + getBMICategory(bmi[i]));
				System.out.println("Heart rate: " + heartRate[i]);
		}
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
				
			}
			input.nextLine();
		}
		
		
		return number;
	}
	
	public static int getPositiveInt(Scanner input, String questionPrompt)
	{
		int number = 0;
		boolean track = false;
		while(!track) {
			
			System.out.println(questionPrompt);
			if (input.hasNextInt())
			{
				number = input.nextInt();
				
				if(number > 0)
				{ 
					track = true;
				}
				else
				{ 
					System.out.println("enter a postive number.");
				}
			}
			else 
			{
				System.out.println("input is not a intager");
				
			}
			input.nextLine();
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
			category = "underwaight.";
		}
		else if (bmi >= 18.5 && bmi < 25) 
		{
			category = "normal.";
		}
		else if (bmi >= 25 && bmi < 30) 
		{
			category = "overwaight.";
		}
		else
		{
			category = "obese.";
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
