package oop.utils;

import oop.car.Car;
import oop.utils.PathBuilder;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class Transaction {

    private ArrayList<Car> carList;
    private String filePath;
  
    // Constructor that load carList from file using CarLoader
    public Transaction(ArrayList<Car> carList) throws FileNotFoundException {
        this.carList = carList;

		PathBuilder path = new PathBuilder(carList.get(0).getType(), carList.get(0).getBrand());
        this.filePath = path.getPath(); 
    }

    // Method to add a car object to list
    public static boolean isFull(Car car){
        if(car.getNum() == 99){
            System.out.println("Stock full");
            return true;
        }
        return false;
    }
    public static boolean isEmpty(Car car){
        if(car.getNum() == 0){
            System.out.println("No more stock");
            return true;
        }
        return false;
    }
    public static void restock(Car car, int num) {
        car.setNum(car.getNum() + num);
        car.setID();
        car.update();
    }
    public static void destock(Car car, int num){
        if(isEmpty(car) || (car.getNum()-num)<=0){
            return;
        }
        car.setNum(car.getNum()- num);
        car.setID();
        car.update();
    }

    // Method to remove a car by carID from list
    public boolean removeCar(ArrayList<Car> carList, String carID) {
        Iterator<Car> iterator = carList.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getCarID().equals(carID)) {
                iterator.remove();
                CarLoader.save(carList); 
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
            //System.out.println("Year: " + car.getYear()); // year manufactured
            System.out.println("Model: " + car.getModel()); // model
            System.out.println("Capacity: " + car.getCap()); // capacity
            System.out.println("Height: " + car.getCarY()); // height idk
            System.out.println("Width: " + car.getCarZ()); // width idk
            System.out.println("Length: " + car.getCarX()); // length idk
            //System.out.println("Color: " + car.getColor()); // color
        }
    }
}
