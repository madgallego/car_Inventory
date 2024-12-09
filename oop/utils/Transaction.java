package oop.utils;

import oop.car.Car;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class Transaction {
    private ArrayList<Car> carList; // Current collection of cars

    // Constructor initializes the list
    public Transaction(String filePath) throws FileNotFoundException {
        carList = CarLoader.load(filePath); // Load cars from file using CarLoader
    }

    // Method to add a car
    public void addCar(Car car) {
        carList.add(car);
        System.out.println("\nCar added: " + car.getCarID());
    }

    // Method to remove a car by carID
    public boolean removeCar(String carID) {
        Iterator<Car> iterator = carList.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getCarID().equals(carID)) {
                iterator.remove(); // Safe removal during iteration
                System.out.println("\nCar removed: " + carID);
                return true; // Car successfully removed
            }
        }
        System.out.println("\nCar not found: " + carID);
        return false; // Car not found
    }

    // Method to traverse and display all cars
    public void displayCars() {
        if (carList.isEmpty()) {
            System.out.println("\nNo cars in the list.");
            return;
        }
        for (Car car : carList) {
            System.out.println();
            System.out.println("Car ID: " + car.getCarID());
            System.out.println("Price: " + car.getPrice());
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Type: " + car.getType());
            System.out.println("Model: " + car.getModel());
            System.out.println("-----------------------------");
        }
    }

    // Getter for the car list
    public ArrayList<Car> getCarList() {
        return carList;
    }
}
