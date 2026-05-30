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

		
		
		
		//make method to add user input to a 2d arrayList
		
		
		
		
	}	
	
}

class CookBook {
	
	private int numberOfPages  ;
	private String bookName = "";
	

	public CookBook(String bookName) {
		this.bookName = bookName;
	}
	
	
		
		
	}

/**
 * this class creates a recipe that contains a list of ingredients and the directions for how to make the recipe 
 * 
 * @param String directions
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
	
	public String getRecpieName() {
		return recpieName;
	}
	
	public void setRecpieName( String newRecpieName) {
		recpieName = newRecpieName;
		
	}
	
	public String getDirections(){
		return directions;
	}
	 
	public Ingerdent getIngerdent( int ingerdentIndex) {
		return ingredents.get(ingerdentIndex);
		
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
	private int ingdrentAmount;
	private String ingdrentMesuerment;
	private String cutType;
	
	public Ingerdent(String ingderentName, int ingderntAmount, String ingderentMesuerment, String cutType) {
		
		this.ingdrentAmount = ingderntAmount;
		this.ingdrentName = ingderentName;
		this.ingdrentMesuerment = ingderentMesuerment;
		this.cutType = cutType;
	}
	
	public Ingerdent(String ingderentName, int ingderntAmount, String ingderentMesuerment) {
		
		this.ingdrentAmount = ingderntAmount;
		this.ingdrentName = ingderentName;
		this.ingdrentMesuerment = ingderentMesuerment;
	}
	
	public String getIngdrentName() {
		
		return this.ingdrentName;
	}
	
	public int getIngderentAmount() {
		
		return this.ingdrentAmount;
	}
	
	public String getIngderentMesuerment() {
		
		return this.ingdrentMesuerment;
	}
	
	public void setIngdrentName(String ingderentName ) {
		this.ingdrentName = ingderentName;
		
	}
	
	public void setIngderentAmount(int ingderentAmount) {
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




