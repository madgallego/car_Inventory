package oop.utils;

import oop.car.Car;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;



public class CarLoader{

	public static ArrayList<Car> load(String file_name) throws FileNotFoundException {	//returns an arraylist containing all cars within the object
		File f = new File(file_name);
		Scanner scan = new Scanner(f);
		ArrayList<Car> cars = new ArrayList<Car>();
		
		while(scan.hasNextLine()){
			Car car = new Car(scan.nextLine());
			cars.add(car);
		}
		
		return cars;
		
		
		
	}







}