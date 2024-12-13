package oop.utils;

import oop.car.Car;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class Transaction {

    private ArrayList<Car> carList;
    private String filePath;
  
    // Constructor that load carList from file using CarLoader
    public Transaction(String filePath) throws FileNotFoundException {
        carList = CarLoader.load(filePath);
        this.filePath = filePath; 
    }

    // Method to add a car object to list
    public void addCar(Car car) {
        carList.add(car);        
        CarLoader.save(filePath, carList);
        System.out.println("\nCar added: " + car.getCarID());
    }

    // Method to remove a car by carID from list
    public boolean removeCar(String carID) {
        Iterator<Car> iterator = carList.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getCarID().equals(carID)) {
                iterator.remove();
                CarLoader.save(filePath, carList); 
                System.out.println("\nCar removed: " + carID);
                return true; // Car successfully removed
            }
        }
        System.out.println("\nCar not found: " + carID);
        return false; 
    }

	//search via id
	public static Car searchID(ArrayList<Car> list, String carID){
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getCarID() == carID)
				return list.get(i);	//car found
		}
		return null; //car not found
	}

	//search via transmission
	public static Car searchTrans(ArrayList<Car> list, String transmission){
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getTransmission() == transmission)
				return list.get(i);	//car found
		}
		return null; //car not found
	}
	//search via transmission but all occurrences
	public static ArrayList<Car> searchTransAll(ArrayList<Car> list, String transmission){
		ArrayList<Car> found = new ArrayList<Car>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getTransmission() == transmission)
				found.add(list.get(i));	//car found
		}
		return found;
	}

	//search via brand
	public static Car searchBrand(ArrayList<Car> list, String brand){
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getBrand() == brand)
				return list.get(i);	//car found
		}
		return null; //car not found
	}
	//search via brand but all occurrences
	public static ArrayList<Car> searchBrandAll(ArrayList<Car> list, String brand){
		ArrayList<Car> found = new ArrayList<Car>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getBrand() == brand)
				found.add(list.get(i));	//car found
		}
		return found;
	}
 
	//search via model
	public static Car searchModel(ArrayList<Car> list, String model){
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getModel() == model)
				return list.get(i);	//car found
		}
		return null; //car not found
	}
	//search via model but all occurrences
	public static ArrayList<Car> searchModelAll(ArrayList<Car> list, String model){
		ArrayList<Car> found = new ArrayList<Car>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getModel() == model)
				found.add(list.get(i));	//car found
		}
		return found;
	}

    // Method to traverse and display all cars from ArrayList
    public void displayCars() {
        if (carList.isEmpty()) {
            System.out.println("\nNo cars in the list.");
            return;
        }
        for (Car car : carList) {//display all attributes (based sa slides natin. Checker lang toh na method.)
            System.out.println();
            System.out.println("Car ID: " + car.getCarID()); // id
            System.out.println("Price: " + car.getPrice()); // price
            System.out.println("Brand: " + car.getBrand()); // brand
            System.out.println("Type: " + car.getType()); // type
            System.out.println("Year: " + car.getYear()); // year manufactured
            System.out.println("Model: " + car.getModel()); // model
            System.out.println("Capacity: " + car.getCap()); // capacity
            System.out.println("Height: " + car.getCarY()); // height idk
            System.out.println("Width: " + car.getCarZ()); // width idk
            System.out.println("Length: " + car.getCarX()); // length idk
            System.out.println("Color: " + car.getColor()); // color
        }
    }
}
