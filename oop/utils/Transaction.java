package oop.utils;

import oop.car.Car;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class Transaction {

    private ArrayList<Car> carList;
    private String filePath;
  
    // Load carList from file using CarLoader
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

    // Method to traverse and display all cars from ArrayList
    public void displayCars() {
        if (carList.isEmpty()) {
            System.out.println("\nNo cars in the list.");
            return;
        }
        for (Car car : carList) {//display all attributes (based sa slides natin)
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
