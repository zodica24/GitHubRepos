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
		/* test casses
		double [] bmi = {18.4,20.5,30.5,22.1,16.9};
		int [] heartRates = {120,180,130,220,150};
		String [] names = {"jack","mike","jess","pete","luke"};
		*/
		
		System.out.println("**************************************\nProgram Overview\n**************************************");
		printOverview();
		
		System.out.println("**************************************\nAthlete Entry\n**************************************");
		int hold = getPositiveInt(input,"plese enter number of alathleates: ");
		double [] bmi = new double[hold];
		String [] names = new String[hold];
		int [] heartRates = new int[hold];
		getInfo(bmi,names,heartRates,input);
		
		System.out.println("============Athleate Summry=========\n");
		printSummery(bmi,names,heartRates);
		
		System.out.println("========== BMI Analysis ==========\n");
		outNormBMI(names,bmi);
		
		System.out.println("========== MHR Analysis ========== \n");
		double heartRateAvarage = calculateAvarage(heartRates);
		highestMHR(names,heartRates);
		aboveMHRAvarage(heartRateAvarage,names,heartRates);
	
		if(askToContinue(input))
		{
			calculateTHR(heartRates,names,input);
		}
		
		System.out.print("**************************************\nTraining Program Analysis Complete\n**************************************");
			
		// end of main
}
	public static int getMaxHeartRate(int age) {
		int heartRates = 220 - age;
		
		return heartRates;
		// end of getMaxHeartRate
	}
	
	public static void getInfo(double [] bmi, String [] names, int [] heartRates, Scanner input) {
		
 		double hight = 0;
		double waight = 0;
		int age = 0;
		
		for(int i = 0; i < bmi.length; i++) {
			System.out.print("\nenter athleates name: ");
			names[i] = input.next();
			hight = getPositiveDouble(input,"enter athleates hight:");
			waight = getPositiveDouble(input,"enter athleates whight:");
			bmi[i] = calulateBMI(hight,waight);
			age = getPositiveInt(input,"enter athleates age: ");
			heartRates[i] = getMaxHeartRate(age);
		}
		
		return;
		// end of getInfo
	}

	public static void printSummery(double [] bmi, String [] names, int [] heartRate)
	{
		for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
				System.out.println("BMI: " + bmi[i]);
				System.out.println("Catgory: " + getBMICategory(bmi[i]));
				System.out.println("Heart rate: " + heartRate[i] + "\n");
		}
		return;
		// end of printSummery
	}
	
	public static double getPositiveDouble(Scanner input, String questionPrompt)
	{
		double number = 0;
		boolean track = false;
		while(!track) {
			
			System.out.print("\n" + questionPrompt);
			if (input.hasNextDouble())
			{
				number = input.nextDouble();
				
				if(number > 0)
				{ 
					track = true;
				}
				else
				{ 
					System.out.print("\nenter a postive number:");
				}
			}
			else 
			{
				System.out.print("\ninput is not a intager");
				
			}
			input.nextLine();
		}
		
		
		return number;
		// end of getPositiveDouble
	}
	
	public static int getPositiveInt(Scanner input, String questionPrompt)
	{
		int number = 0;
		boolean track = false;
		while(!track) {
			
			System.out.print("\n" + questionPrompt);
			if (input.hasNextInt())
			{
				number = input.nextInt();
				
				if(number > 0)
				{ 
					track = true;
				}
				else
				{ 
					System.out.print("\nenter a postive number:");
				}
			}
			else 
			{
				System.out.print("\ninput is not a intager.");
				System.out.print("\nenter a postive number:");
				
			}
			input.nextLine();
		}
		
		
		return number;
		// end ofgetPositiveInt
	}
	
	public static double calulateBMI(double hight, double waight) 
	{
		double bmi = 0;
		final int bmiNumber = 703;
		
				
		bmi = waight * bmiNumber / (hight * hight);
		
		return bmi;
		// end of calulateBMI
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
		// end of getBMICategory
	}
	
	public static boolean askToContinue(Scanner input)
	{
		boolean answer = false;
		boolean track = false;
		char chosse =' ';
		do	
		{
			System.out.println("\nWould you like to calculate athleates training heart rates: enter Y/N.");
				chosse = Character.toUpperCase(input.next().charAt(0));
				if (chosse == 'Y' || chosse == 'N')
				{
					if (chosse == 'Y')
					{
						answer = true;
					}
					else
					{
					}
					track = true;
				}
				else
				{
					System.out.println("entry error: enter Y or N");
				}
		}
		while(!track);
		
		return answer;
		// end ofaskToContinue
	}
	
	public static double calculateAvarage(int [] currentNums) {
		double avarage = 0;
		
		for(int i = 0; i < currentNums.length; i++) {
			avarage += currentNums[i];
		}
		avarage = avarage / currentNums.length;
		
		System.out.println("the teams avarage max heart rate is: " + avarage + "\n");
		
		return avarage;
		// end of calculateAvarage
	}
	
	public static void highestMHR(String [] names, int [] heartRates) {
		
		int tracker = 0;
		
		for(int i = 1; i < names.length; i++) {
			
			if(heartRates[i] > heartRates[tracker]) {
				tracker = i;
			}
		}
		
		System.out.println(names[tracker] + " has the highest max heart rate at: " + heartRates[tracker] + "\n");
		
		return;
		//end of highestMHR
	}
	
	public static void aboveMHRAvarage(double heartRateAve, String [] names, int [] heartRates) {
		
		System.out.println("Athletes above or equal to avarave max heart rate:");
		
		for(int i = 0; i < names.length; i++) {
			
			if(heartRates[i] >= heartRateAve) {
				 System.out.println(names[i]);
			}
		}
		return;
		// end of aboveMHRAvarage
	}
	
	public static void calculateTHR ( int [ ] heartRates, String [ ] names, Scanner input) {
		
		double trainingPercent = getPositiveDouble(input,"Enter training percentage: ");
		double tHR =0;
		
		for(int i = 0; i < names.length;i++) {
			
			tHR = (heartRates[i] * trainingPercent) / 100;
			System.out.println(names[i] + " training heart rate is: " + tHR);
		}
		return;
		// end of calculateTHR
	}
	
	public static void outNormBMI( String [ ] names, double [ ] bmi ) {
		
		boolean track = true;
		
		for(int i = 0; i < names.length; i++) {
			
			if(bmi[i] < 18.5) {
				System.out.println(names[i] + " is " + getBMICategory(bmi[i]));
				track = false;
			}
			else if( bmi[i] >= 25) {
				System.out.println(names[i] + " is " + getBMICategory(bmi[i]));
				track = false;
			}
		}
		
		if(track) {
			System.out.println("All athletes are within normal BMI range.");
		}
		return;
		//end of outNormBMI
	}
	
	public static void printOverview() {
		System.out.println("The trainer enters how many athletes are on the team.");
		System.out.println("Then the trainer enters each athlete's weight, height and age.");
		System.out.println("For each athlete, the program calculates BMI and Max Heart Rate.");
		System.out.println("BMI Categories");
		System.out.println("Under 18.5: Underweight");
		System.out.println("18.5 to under 30: Normal");
		System.out.println("30 or greater: Overweight");
		System.out.println("Calculates percentage of max heart rate for training");
		return;
		// end of printOverview
	}
	// end of class
}
