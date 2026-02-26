/**
 * 
 */
//this is how you add the scanner class to your program
import java.util.Scanner;


public class TicketPriceFinder {

	public static void main(String[] args) {
		
		char sectionNumber = ' ';
		
		int rowNumber = 0;
		
		int seatPrice = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("plese enter what section you would like to sit in: F-(Front), C-(Center), S-(Side), U-(Upper).\n");
		
		//used to convert and grab the first letter of the inputed string and change it to uppercase and cast it as a char
		sectionNumber = (char) Character.toUpperCase(input.next().charAt(0));
		
		// used a if - else statment to check if the input is one of the letters i want 
		if (sectionNumber == 'F' || sectionNumber == 'C' || sectionNumber == 'S' ||sectionNumber == 'U' )
		{
			// useing a swicth statment to filter for wicth letter was entered
			switch(sectionNumber)
			{
				case 'F':
					System.out.print("you chose the Front section.\n");
					break;
				case 'C':
					System.out.print("you chose the Center section.\n");
					break;
				case 'S':
					System.out.print("you chose the Side section.\n");
					break;
				case 'U':
					System.out.print("you chose the Upper section.\n");
					break;
				default: 
					
					break;
			}
			
			System.out.print("please enter you disired row: 1-60.\n");
			rowNumber = input.nextInt();
			
			//used a nested multi way if statment to test for the row that was entered
			if (rowNumber >= 1 && rowNumber <= 15)
			{
				seatPrice = 450;
				System.out.print("Section " + sectionNumber + " row " + rowNumber + " costs $" + seatPrice + ".");
			}
			// used a logical opp to only run this else-if if bouth casses are true
			else if (rowNumber >= 16 && rowNumber <= 30)
			{
				seatPrice = 300;
				System.out.print("Section " + sectionNumber + " row " + rowNumber + " costs $" + seatPrice + ".");
			}
			else if (rowNumber >= 1 && rowNumber <= 15)
			{
				seatPrice = 200;
				System.out.print("Section " + sectionNumber + " row " + rowNumber + " costs $" + seatPrice + ".");
			}
			else
			{
				System.out.print("Error: Row entered dos not exist: exiting program.");
			}
		}
		else	
			{
				System.out.print("Error: Section choice entered is InValid; closing program.");
			}
		
		input.close();
	}

}
