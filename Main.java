import java.io.FileNotFoundException;
import java.util.ArrayList;
import oop.car.Car;
import oop.utils.CarLoader;

public class Main{

	public static void main(String args[]){
		//Renderer window = new Renderer();
		//window.display();
		
		String filepath = "oop\\database\\SUV.txt";
		//will be creating an object fetcher that can modify file path for better accesibility

		ArrayList<Car> SUV = new ArrayList<Car>();
		try{
			SUV = CarLoader.load(filepath);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}

		for(int i = 0; i < SUV.size(); i++){
			System.out.println(SUV.get(i).getCarID());
			System.out.println(SUV.get(i).getPrice());
			System.out.println(SUV.get(i).getBrand());
			System.out.println(SUV.get(i).getType());
			System.out.println(SUV.get(i).getModel());
			//System.out.println(SUV.get(i).getCount());
		}
		
	}


}

/* 
import java.io.FileNotFoundException;
import java.util.ArrayList;
import oop.car.*;
import oop.utils.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "oop\\database\\SUV.txt"; // Path to the file
        
        try {
            // Initialize Transaction object
            Transaction transaction = new Transaction(filePath);

            // Display initial cars
            System.out.println("\nInitial list of cars:");
            transaction.displayCars();

            // Create a new car (SUV in this case) and add it
            Car newCar = new SUV("PAF03MX30157913"); // Example car object
            transaction.addCar(newCar);

            // Display updated cars list
            System.out.println("\nUpdated list of cars:");
            transaction.displayCars();

            // Remove a car by ID
            transaction.removeCar("PAF03MX30157913");

            // Display updated cars list again
            System.out.println("\nUpdated list of cars after removal:");
            transaction.displayCars();

        } catch (FileNotFoundException e) {
            System.out.println("\nFile not found: " + filePath);
        }
    }
}
*/