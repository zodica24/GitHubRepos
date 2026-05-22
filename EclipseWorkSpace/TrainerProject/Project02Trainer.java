
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * 
 */

public class Project02Trainer
{
	public static void main(String[] args)
	{
		displayProgramSummary();

		// ===== TEST 1 =====
		
		String fileName = "team1.txt";
		/*
		try
		{
			System.out.println("\nTesting file: " + fileName);

			Team team = new Team("Nuggets", 6);

			teamSetUp(fileName, team);

			runAnalysis(team);

		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + fileName);
		} */

		// ===== TEST 2 =====
		fileName = "testTeam.txt";

		try
		{
			System.out.println("\nTesting file: " + fileName);

			Team team = new Team("Team lip", 2);

			teamSetUp(fileName, team);

			runAnalysis(team);

		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + fileName);
		}

		System.out.println("\nEnd of program");
	}

	public static void teamSetUp(String fileName, Team team) throws FileNotFoundException
	{
		File inputFile = new File(fileName);
		Scanner fileScanner = new Scanner(inputFile);
		while (fileScanner.hasNext())
		{
			String name = fileScanner.next();
			double height = fileScanner.nextDouble();
			double weight =fileScanner.nextDouble();
			int age  = fileScanner.nextInt();
			Athlete athlete = new Athlete(name,height,weight,age);
			team.addAthlete(athlete);
		}
		fileScanner.close();
	}

	public static void runAnalysis(Team team) throws FileNotFoundException
	{
		System.out.println("\n========== Team Analysis ==========");
		System.out.println("Team: " + team.getTeamName());
		System.out.println("Total Athletes: " + team.getAthleteCount());
		System.out.println();

		team.displayAthleteResults();
		team.displayAthletesOutsideNormalBMI();

		double avg = team.calculateAverageMaxHeartRate();
		System.out.println("\nAverage Max Heart Rate: " + avg);

		team.displayAthletesAboveAverageMHR(avg);
		team.displayHighestMHR();
		team.displaySmallestLargestHeight();
		String outputFileName = team.getTeamName() + ".txt";
		team.writeAthletesToFile(outputFileName);

	}

	// ================= DISPLAY =================

	public static void displayProgramSummary()
	{
		System.out.println("**************************************");
		System.out.println("Team and Athlete Analysis");
		System.out.println("**************************************");
		System.out.println("Reads athlete data from file");
		System.out.println("Displays athlete results");
		System.out.println("Performs team analysis");
		System.out.println("Writes results to file");
		System.out.println();
	}
}

// ================= ADD ATHLETE CLASS =================

// ================= ADD TEAM CLASS =================

class Team{
	
	private String teamName;
	private Athlete [] athlete;
	private int athleteCount = 0;
	
	public Team (String teamName, int maxAthletes) {
		
		this.teamName = teamName;
		athlete = new Athlete[maxAthletes];
		
	}
	
	public String getTeamName() {
		
		return teamName;
	}
	
	public int getAthleteCount() {
		
		return athleteCount;
	}

	public void addAthlete(Athlete athlete) {
		
		this.athlete[athleteCount] = athlete;
		athleteCount++;
		
	}

	public void displayAthleteResults() {
		
		for (int curentAthlete = 0; curentAthlete < athlete.length; curentAthlete++) {
			
			athlete[curentAthlete].displayAthleteAnalysis();
		}
		
	}
	
	public void displayAthletesOutsideNormalBMI() {
		
		boolean track = true;
		
		for(int i = 0; i < athlete.length; i++) {
			
			if(athlete[i].calculateBMI() < 18.5 || athlete[i].calculateBMI() >= 25) {
				System.out.println(athlete[i].getName() + " is " + athlete[i].determinBMICategory());
				track = false;
			}
		}
		
		if(track) {
			System.out.println("All athletes are within normal BMI range.");
		}
		
	}
	
	public double calculateAverageMaxHeartRate() {
		
		double avarage = 0;
		
		for(int i = 0; i < athlete.length; i++) {
			avarage += athlete[i].calculateMaxHeartRate();
		}
		avarage = avarage / athleteCount;
	
		return avarage;
	}
	
	public void displayAthletesAboveAverageMHR(double avg) {
		
		System.out.println("Athletes above or equal to avarave max heart rate:");
		
		for(int i = 0; i < athlete.length; i++) {
			
			if(athlete[i].calculateMaxHeartRate() >= avg) {
				 System.out.println(athlete[i].getName());
			}
		}	
	}
	
	public void displayHighestMHR() {
		int tracker = 0;
		
		for(int i = 1; i < athlete.length; i++) {
			
			if(athlete[i].calculateMaxHeartRate() > athlete[tracker].calculateMaxHeartRate()) {
				tracker = i;
			}
		}
		System.out.println(athlete[tracker].getName() + ": " + athlete[tracker].calculateMaxHeartRate());
	}
		
	public void displaySmallestLargestHeight() {
		
		int tracker1 = 0;
		int tracker2 = 0;
		
		for(int i = 1; i < athlete.length; i++) {
			
			if(athlete[i].getHeigth() > athlete[tracker1].getHeigth()) {
				tracker1 = i;
			}
			if(athlete[i].getHeigth() < athlete[tracker2].getHeigth()) {
				tracker2 = i;
			}
		}
		System.out.println("Smallest athlete: \n" + athlete[tracker2].getName() + " - " + athlete[tracker2].getHeigth());
		System.out.println("Largest athlete: \n" + athlete[tracker1].getName() + " - " + athlete[tracker1].getHeigth());
	}
		
	public void writeAthletesToFile(String fileName) throws FileNotFoundException {
		
		File teamFile = new File(fileName);
		
		PrintWriter teamWriter = new PrintWriter(teamFile);
		
		for(int curentTeam = 0; curentTeam < athleteCount; curentTeam++) {
			
			teamWriter.println(athlete[curentTeam].getName() + "\n BMI: " + athlete[curentTeam].calculateBMI() + "\n Category: " + athlete[curentTeam].determinBMICategory() + "\n MHR:" + athlete[curentTeam].calculateMaxHeartRate());
		}
			
		teamWriter.close();
	}
}

class Athlete{
	
	private String name;
	private int age;
	private double height;
	private double weight;
	
	public Athlete(String name, double weight, double height, int age) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	public String getName() {
		
		return name;
	}
	
	public double getHeigth() {
		
		return height;
	}
	
	public double calculateBMI() {
		
		double bmi = 0;
		final int bmiNumber = 703;
		
		bmi = weight * bmiNumber / (height * height);
		
		return bmi;
		
	}
	public String determinBMICategory() {
		
		
		String category ="";
		
		if (calculateBMI() < 18.5)
		{
			category = "underwaight.";
		}
		else if (calculateBMI() >= 18.5 && calculateBMI() < 25) 
		{
			category = "normal.";
		}
		else if (calculateBMI() >= 25 && calculateBMI() < 30) 
		{
			category = "overwaight.";
		}
		else
		{
			category = "obese.";
		}
		
		return category;
	}
	
	public int calculateMaxHeartRate() {
		
		return 220 - age;
	}
	
	public void displayAthleteAnalysis() {
		
		System.out.println(name);
		System.out.println("BMI: " + calculateBMI());
		System.out.println("Category: " + determinBMICategory());
		System.out.println("MHR: " + calculateMaxHeartRate());
		
	}
	
}