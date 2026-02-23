/**
 * 
 */

/**
 * 
 */

import java.util.Scanner;


public class TicketPriceFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char sectionNumber = ' ';
		
		double rowNumber = 0;
		
		int seatPrice = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("plese enter what section you would like to sit in: F-(Front), C-(Center), S-(Side), U-(Upper) \n");
		
		sectionNumber =(char) Character.toUpperCase(input.next().charAt(0));
		
		switch(sectionNumber)
		{
			case 'F':
				System.out.print("you chose the Front section.\n");
				
				break;
			case 'C':
				System.out.print("you chose the Center section.");
				break;
			case 'S':
				System.out.print("you chose the Side section.");
				break;
			case 'U':
				System.out.print("you chose the Upper section.");
				break;
			default: 
				System.out.print("Error: Section choice entered is InValid; closing program.");
				break;
		}
		
		System.out.print(" please enter you disired row: 1-60.\n");
		rowNumber = input.next().charAt(0);
		
		if (rowNumber >= 1 && rowNumber <= 15)
		
		{
			seatPrice = 450;
			System.out.print("Section " + sectionNumber + " row " + rowNumber + " costs " + seatPrice + ".");
		}
		else if (rowNumber >= 16 && rowNumber <= 30)
		{
			seatPrice = 300;
			System.out.print("Section " + sectionNumber + " row " + rowNumber + " costs " + seatPrice + ".");
		}
		else if (rowNumber >= 1 && rowNumber <= 15)
		{
			seatPrice = 200;
			System.out.print("Section " + sectionNumber + " row " + rowNumber + " costs " + seatPrice + ".");
		}
		else
		{
			System.out.print("Error: Row entered dos not exist: exiting program.");
		}
		
		input.close();
	}

}
