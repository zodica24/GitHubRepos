/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class SumCalucator {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int max = 0;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("plese enter a max number for you sum total.\n");
		max = input.nextInt();
		
		sum = calculateSum(max);
		
		System.out.print(sum);
		
		input.close();
		
	//end of main	
	}

	
	
	public static int calculateSum(int max)
	{
		int sum = 1;
		for (int i = 1; i <= max; i++) 
		{
			sum = sum *i;
			
		}
		return sum;
	}
}
