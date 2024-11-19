package oop.utils;

import oop.car.Car;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import oop.car.SUV;


public class CarLoader{

	private static File f;
	private static Scanner scan;
	public static ArrayList<Car> load(String file_name) throws FileNotFoundException {	//returns an arraylist containing all cars within the object
		f = new File(file_name);
		scan = new Scanner(f);
		ArrayList<Car> cars = new ArrayList<Car>();
		
		while(scan.hasNextLine()){
			SUV car = new SUV(scan.nextLine());
			cars.add(car);
		}
		
		return cars;
	}

	public static ArrayList<SUV> SUVload(String file_name) throws FileNotFoundException {	//returns an arraylist containing all cars within the object
		f = new File(file_name);
		scan = new Scanner(f);
		ArrayList<SUV> cars = new ArrayList<SUV>();
		
		while(scan.hasNextLine()){
			SUV car = new SUV(scan.nextLine());
			cars.add(car);
		}
		
		return cars;
	}






}