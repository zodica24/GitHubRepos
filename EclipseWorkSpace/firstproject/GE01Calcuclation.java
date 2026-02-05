/**
 * 
 */

/**
 * 
 */
public class GE01Calcuclation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final double classPart = .15;
		final double guided_Expo = .20;
		final double quizzes = .25;
		final double projects = .20;
		final double final_Demo = .20;
		
		int class_Part_Grade = 95;
		int guided_Expo_Grade = 92;
		int quizzes_Grade = 88;
		int projects_Grade = 87;
		int final_Demo_Grade = 93;
		
		
		double class_Part_Grade_Fianl =  classPart * class_Part_Grade;
		double guided_Expo_Grade_Fianl = guided_Expo * guided_Expo_Grade;
		double quizzes_Grade_Final = quizzes_Grade * quizzes;
		double projects_Grades_Final = projects * projects_Grade;
		double final_Demo_Grade_Final = final_Demo_Grade * final_Demo;
		
		double grade_Average = class_Part_Grade_Fianl + guided_Expo_Grade_Fianl + quizzes_Grade_Final + projects_Grades_Final + final_Demo_Grade_Final;
		
		System.out.println(grade_Average);

	}

}
