/**
 * 
 */

import java.util.Scanner;


public class TicketPriceFinder {

	public static void main(String[] args) {
		
		char sectionNumber = ' ';
		
		int rowNumber = 0;
		
		int seatPrice = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("plese enter what section you would like to sit in: F-(Front), C-(Center), S-(Side), U-(Upper).\n");
		
		sectionNumber = (char) Character.toUpperCase(input.next().charAt(0));
		
		if (sectionNumber == 'F' || sectionNumber == 'C' || sectionNumber == 'S' ||sectionNumber == 'U' )
		{
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
			
			if (rowNumber >= 1 && rowNumber <= 15)
			{
				seatPrice = 450;
				System.out.print("Section " + sectionNumber + " row " + rowNumber + " costs $" + seatPrice + ".");
			}
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
