/**
 * 
 */

/**
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;


class CookBookAppV01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int choice;
		ArrayList <CookBook> cookBooks = new ArrayList <CookBook>();
		
		do {
			System.out.println("1: make new cookbook");
			System.out.println("2: add recpie to a cookbook");
			System.out.println("3: edit a Recpie");
			System.out.println("4: deleat a recpie");
			System.out.println("5: delete a cookbook");
			
			choice = input.nextInt();
			
			switch(choice) {
				
			case 1:
				System.out.println("please name your new cookbook");
				String bookName = input.next();
				
				CookBook newBook = new CookBook(bookName);
				cookBooks.add(newBook);
				break;
				
			case 2:
				
				int bookChoice;
				if( cookBooks.isEmpty()) {
					
					System.out.println("no cookBooks exist plese make a book");
					
				}
				else {
					System.out.println("which book would you like to add the recpie to.");
					displayBooks(cookBooks);
					bookChoice = input.nextInt();
					addRecpieToBook(cookBooks.get(bookChoice) ,input);
				}
				//work on adding a recpie to cook book
				break;
				
	
			}
		} while(choice != 6);
			

	}
	
	
	public static void displayBooks(ArrayList <CookBook> cookBooks) {
		
		for (int i = 0; i < cookBooks.size(); i++) {
			
			System.out.print(i + ":" + cookBooks.get(i).getBookName());
		}
		
	}
	
	public static void addRecpieToBook( CookBook cookBook, Scanner input) {
		
		ArrayList <Ingerdent> ingerdents = new ArrayList<Ingerdent>();
		
		System.out.println("what is the name of the recpie:");
		String recpieName = input.next();
		System.out.println("would you like to add ingerdents Y/N:");
		char answer = (char) Character.toUpperCase(input.next().charAt(0));
		if (answer == 'Y') {
			ingerdents = addIngderentsToRecpie(input);
		}
		System.out.println("what are the deriction");
		String directions = input.nextLine();
		
		if (answer == 'Y') {
			Recpie recpie = new Recpie(directions, recpieName, ingerdents);
			cookBook.addrecpie(recpie);
		}
		else {
			Recpie recpie = new Recpie(directions, recpieName);
			cookBook.addrecpie(recpie);
		}
		
		
		
	}
		
	public static ArrayList<Ingerdent> addIngderentsToRecpie(Scanner input) {
		
		boolean track = true;
		ArrayList <Ingerdent> ingerdents = new ArrayList <Ingerdent>();
		
		do {
			
			System.out.println("what is the ingerdents name");
			String name = input.next();
			System.out.println("what is the amount of the ingerdent");
			double amount = input.nextDouble();
			System.out.println("what is the mesuerment of the ingerdent");
			String mesurment = input.next();
			System.out.println("what is the cut of the ingerdent/n Enter na if none");
			String cut = input.next();
			
			if (cut == "na") {
				Ingerdent newIngerdent = new Ingerdent(name, amount, mesurment);
				
				ingerdents.add(newIngerdent);
				
			}
			else {
				Ingerdent newIngerdent = new Ingerdent(name, amount, mesurment, cut);
				
				ingerdents.add(newIngerdent);
				
			}
			
			System.out.println("is there another ingerdent");
			char answer = (char) Character.toUpperCase(input.next().charAt(0));
			
			if(answer == 'N') {
				track = true;
			}
			
		}
		while(!track);
		
		return ingerdents;
	}
	
	
	
}	
		
			

class CookBook {
	
	private ArrayList <Recpie> recipes;
	private int numberOfPages;
	private String bookName = "";
	

	public CookBook(String bookName) {
		this.bookName = bookName;
	}
	
	public void setBookName( String newBookName) {
		bookName = newBookName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public Recpie getRecipe(String recpieName) {
		
		Recpie myRecpie =  recipes.get(0);
		
		for(int i = 0; i < recipes.size(); i++) {
			
			if (recipes.get(i).getRecpieName() == recpieName) {
				
				myRecpie = recipes.get(i);
			}
		}
		return myRecpie;
	}
		
	public int getPageCount() {
		return numberOfPages;
	}
	
	public void addrecpie(Recpie recpie) {
		
		recipes.add(recpie);
		
		
	}
	
		
	}

/**
 * this class creates a recipe that contains the recipe name, a list of ingredients,
 * and the directions for how to make the recipe 
 * 
 * @param String directions
 * @param string recipe name
 * 
 */
class Recpie {
	
	private String recpieName;
	private ArrayList <Ingerdent> ingredents;
	private String directions;
	
	
	public Recpie( String directions, String recpieName) {
		
		ingredents = new ArrayList <> ();
		this.directions = directions;
		this.recpieName = recpieName;
		
	}
	
	public Recpie(String directions, String recpieName, ArrayList <Ingerdent> ingredents) {
		
		this.ingredents = ingredents;
		this.directions = directions;
		this.recpieName = recpieName;
	}
	
	public String getRecpieName() {
		return recpieName;
	}
	
	public void setRecpieName( String newRecpieName) {
		recpieName = newRecpieName;
		
	}
	
	public String getDirections(){
		return directions;
	}
	 
	public Ingerdent getIngerdent( String ingredentName) {
		
		Ingerdent myIngerdent = ingredents.get(0);
		
		for(int i = 1; i < ingredents.size(); i++) {
			
			if (ingredents.get(i).getIngdrentName() == ingredentName) {
				
				myIngerdent = ingredents.get(i);
			}
		}
		
		return myIngerdent;
		
	}
	
	public void setDerictions(String newDirections) {
		
		this.directions = newDirections;
	}
	
	public void changeIngerdent(String ingerdentName, Ingerdent ingerdent ){
		
		
		for (int i = 0; i < ingredents.size(); i++) {
			
			if (ingredents.get(i).getIngdrentName() == ingerdentName){
				
				ingredents.set(i, ingerdent);
				
			}
		}
	
	}
	
	public void addIngerdent(Ingerdent ingerdent) {
		
		ingredents.add(ingerdent);
	}
	
	
	
}

/**
 * this class makes an ingredient using the name, amount, and measurements provided 
 * @param ingderentName
 * @param ingderentAmount
 * @param ingderentMesuerment
 */
class Ingerdent{
	
	private String ingdrentName; 
	private double ingdrentAmount;
	private String ingdrentMesuerment;
	private String cutType;
	
	public Ingerdent(String ingderentName, double ingderntAmount, String ingderentMesuerment, String cutType) {
		
		this.ingdrentAmount = ingderntAmount;
		this.ingdrentName = ingderentName;
		this.ingdrentMesuerment = ingderentMesuerment;
		this.cutType = cutType;
	}
	
	public Ingerdent(String ingderentName, double ingderntAmount, String ingderentMesuerment) {
		
		this.ingdrentAmount = ingderntAmount;
		this.ingdrentName = ingderentName;
		this.ingdrentMesuerment = ingderentMesuerment;
	}
	
	public String getIngdrentName() {
		
		return this.ingdrentName;
	}
	
	public double getIngderentAmount() {
		
		return this.ingdrentAmount;
	}
	
	public String getIngderentMesuerment() {
		
		return this.ingdrentMesuerment;
	}
	
	public void setIngdrentName(String ingderentName ) {
		this.ingdrentName = ingderentName;
		
	}
	
	public void setIngderentAmount(double ingderentAmount) {
		this.ingdrentAmount = ingderentAmount;
		
	}
	
	public void setIngderentMesuerment(String ingderentMesuerment) {
		this.ingdrentMesuerment = ingderentMesuerment;
		
	}
	
	public void setIngderentCutType(String cutType) {
		this.cutType = cutType;
	}
	
	
	
	public void printIngderent() {
		
		System.out.println( ingdrentAmount + " " + ingdrentMesuerment + " " + cutType + "" + ingdrentName );
		
	}
	
	
	
}




