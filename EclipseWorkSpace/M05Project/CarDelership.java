/**
 * 
 */

/**
 * 
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CarDelership {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
			displayProgramSummary();
			String fileName = "cars1.txt";
			try
			{
				System.out.println("\nTesting file: " + fileName);
				Dealership dealership = new Dealership("CS Dealership", 6);
				dealershipSetUp(fileName, dealership);
				dealership.displayCars();
				System.out.println("\nMost Expensive Car:\n" + dealership.displayMostExpensiveCar());
				String outputFileName = dealership.getDealershipName() + ".txt";
				dealership.writeCarsToFile(outputFileName);
			} catch (FileNotFoundException exception)
			{
				System.out.println("Error: Unable to find file " + fileName);
			}
			System.out.println("\nEnd of program");
		}
		public static void dealershipSetUp(String fileName, Dealership newDealership) throws FileNotFoundException
		{
			File inputFile = new File(fileName);
			Scanner fileScanner = new Scanner(inputFile);
			while (fileScanner.hasNext())
			{
				String make = fileScanner.next();
				String model = fileScanner.next();
				double price = fileScanner.nextDouble();
				Car car = new Car(make, model, price);
				newDealership.addCar(car);
			}
			fileScanner.close();
		}
		public static void displayProgramSummary()
		{
			System.out.println("**************************************");
			System.out.println("Dealership and Car Analysis");
			System.out.println("**************************************");
			System.out.println("Reads car data from a file");
			System.out.println("Displays all cars");
			System.out.println("Finds most expensive car");
			System.out.println();
		}

	}



class Car{
	
	private String make = "";
	private String model = "";
	private double price = 0;
	
	public Car(String make, String modle, double price) {
		
		this.make = make;
		this.model = modle;
		this.price = price;
		
	}
	
	public String getMakeOfCar() {
		
		return make;
	}
	
	public String getModelOfCar() {
		
		return model;
	}
	
	public double getPriceOfCar() {
		
		return price;
	}
	
	public void displayCar() {
		
		System.out.print(make + " " + model + ": " + price);
	}
}


class Dealership{
	
	private String delershipName = "";
	private Car [] cars;
	private int maxNumOfCars = 0;
	
	
	public Dealership (String delershipName, int maxNumOfCars ) {
		
		this.delershipName = delershipName;
		this.maxNumOfCars = maxNumOfCars;
		cars = new Car[this.maxNumOfCars];
	}
	
	public String getDealershipName() {
		return delershipName;
	}
	
	public void addCar(Car newCar) {
		for(int carNumber = 0; carNumber < cars.length; carNumber++) {
			
			if (cars[carNumber] == null) {
				
				cars[carNumber] = newCar;
				carNumber = cars.length;
			}
		}
		
	}
	
	public Car displayMostExpensiveCar() {
		
		Car mostExpensive = cars[0];
		
		for(int carNumber = 1; carNumber < cars.length; carNumber++) {
			
			if (cars[carNumber].getPriceOfCar() > mostExpensive.getPriceOfCar()) {
				
				mostExpensive = cars[carNumber];
			}
		}
		return mostExpensive;
	}
	
	public void displayCars() {
		
		for(int carNumber = 1; carNumber < cars.length; carNumber++) {
			
			System.out.println(cars[carNumber].getMakeOfCar()+ " " + cars[carNumber].getModelOfCar()+ ": " + cars[carNumber].getPriceOfCar());
		}
		
	}
	
	public void writeCarsToFile(String fileName) {
		
		
		
		
	}
	
	
	
	
}