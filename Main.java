import java.io.FileNotFoundException;
import java.util.ArrayList;
import oop.car.*;
import oop.utils.CarLoader;

public class Main{

	public static void main(String args[]){
		ArrayList<Convertible> c = CarLoader.loadConvertible("PAF");
        for(int i = 0; i < Convertible.count; i++){
            System.out.println(c.get(i).getCarID());
            System.out.println(c.get(i).getCarX());
            System.out.println(c.get(i).getCarY());
            System.out.println(c.get(i).getCarZ());
            System.out.println(c.get(i).getEngine());
            System.out.println(c.get(i).getHorsepower());
            System.out.println(c.get(i).getCap());
            System.out.println(c.get(i).getFueltr());
            System.out.println(c.get(i).getTypeStr());
            
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