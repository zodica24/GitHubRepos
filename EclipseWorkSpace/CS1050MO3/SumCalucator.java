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
		
		sum = calculateSum(max,sum);
		
		System.out.print(sum);
	//end of main	
	}

	
	
	public static int calculateSum(int max,int sum)
	{
		for (int i = 0; i <= max; i++) 
		{
			sum = sum + i;
			
		}
		return sum;
	}
}
