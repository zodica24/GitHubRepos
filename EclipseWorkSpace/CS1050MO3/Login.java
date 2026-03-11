/**
 * 
 */

/**
 * 
 */

import java.util.Scanner;
public class Login {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String savedUserName = "test";
		final String savedPassword = "enter";
		int runTime = 0;
		Scanner input = new Scanner(System.in);
		
		String password = " ";
		String username = "ten";
		
		while ( )
			if ((savedUserName.equals(username))) 
			{
				if ((savedPassword.equals(password)))
				{
					if (savedUserName.equals(username) && savedPassword.equals(password))
					{
						System.out.print("you logedin");
					}
				}
				else
				{
					System.out.print("password is wrong");
				}
			}
			else 
			{
				System.out.print("username is wrong");
			}
	}

}
