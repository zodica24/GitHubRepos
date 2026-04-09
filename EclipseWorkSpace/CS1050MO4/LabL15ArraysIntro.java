
import java.util.Scanner;

public class LabL15ArraysIntro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] grades;
		String[] names;
		double avrage = 0;
		
		System.out.println("how meany students are in class");
		int numberOfStudents = input.nextInt();
		
		names = new String[numberOfStudents];
		grades = new double[numberOfStudents];
		
		nameAndGradeAsssigh(names,grades,input);
		avrage = getAvrage(grades,input);
		aboveAvrage(names,grades,avrage);
		
		System.out.println(avrage);
		
		//end of main
	}

	public static void nameAndGradeAsssigh(String names[],double grades[],Scanner input) 
	{ 
		
		for(int i = 0; i < grades.length; i++ ) 
		{
			System.out.println("what is the students name:");
			names[i] = input.next();
			System.out.println("what was the students final grade:");
			grades[i] = input.nextDouble();
					
		}
		// end of names and grades
	}
	
	public static double getAvrage(double grades[] ,Scanner input)
	{
		double avrage = 0;
		
		for(int i = 0; i < grades.length; i++) 
		{
			avrage =+ grades[i];
		}
		
		avrage = avrage / grades.length;
		
		return avrage;
	}
	
	public static void aboveAvrage(String[] names, double[] grades, double avrage) 
	{
		System.out.println("students above the avrage are:");
		
		for(int i = 0; i < names.length; i++)
		{
			if(grades[i] > avrage) 
			{
				System.out.println(names[i] + " at: " + grades[i]);
			}
			
		}
	}
	
	
}
