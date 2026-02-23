
import java.util.Scanner;

public class GE01Calcuclation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner grade = new Scanner(System.in);
		
		final double classPart = .15;
		final double guidedExpo = .20;
		final double quizzes = .25;
		final double projects = .20;
		final double finalDemo = .20;
		
		int classPartGrade = grade.nextInt();
		int guidedExpoGrade = 92;
		int quizzesGrade = 88;
		int projectsGrade = 87;
		int finalDemoGrade = 93;
		
		
		double classPartGradeFianl =  classPart * classPartGrade;
		double guidedExpoGradeFianl = guidedExpo * guidedExpoGrade;
		double quizzesGradeFinal = quizzesGrade * quizzes;
		double projectsGradesFinal = projects * projectsGrade;
		double finalDemoGradeFinal = finalDemoGrade * finalDemo;
		
		double gradeAverage = classPartGradeFianl + guidedExpoGradeFianl + quizzesGradeFinal + projectsGradesFinal + finalDemoGradeFinal;
		
		if(gradeAverage >= 90) 
		{
			System.out.println(gradeAverage + " = A");
		}
		else if(gradeAverage >= 80) 
		{
			System.out.println(gradeAverage + " = B");
		}
		else if(gradeAverage >= 70) 
		{
			System.out.println(gradeAverage + " = C");
		}
		else if(gradeAverage >= 60) 
		{
			System.out.println(gradeAverage + " = D");
		}
		else
		{
			System.out.println(gradeAverage + " = F");
		}

	}

}
