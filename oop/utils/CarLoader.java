package oop.utils;

import oop.car.Car;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import oop.car.SUV;
import oop.utils.PathBuilder;
import java.io.FileWriter;


public class CarLoader{

	private static File f;
	private static Scanner scan;
	public static ArrayList<Car> load(String file_name) throws FileNotFoundException {	//returns an arraylist containing all cars within the object
		f = new File(file_name);
		scan = new Scanner(f);
		ArrayList<Car> cars = new ArrayList<Car>();
		
		while(scan.hasNextLine()){
			Car car = new Car(scan.nextLine());
			cars.add(car);
		}
		
		return cars;
	}

	//via id
	public static Car searchID(ArrayList<Car> list, String carID){
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getCarID() == carID)
				return list.get(i);	//car found
		}
		return null; //car not found
	}

	//via transmission
	public static Car searchTrans(ArrayList<Car> list, String transmission){
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getTransmission() == transmission)
				return list.get(i);	//car found
		}
		return null; //car not found
	}
	//via transmission but all occurrences
	public static ArrayList<Car> searchTransAll(ArrayList<Car> list, String transmission){
		ArrayList<Car> found = new ArrayList<Car>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getTransmission() == transmission)
				found.add(list.get(i));	//car found
		}
		return found;
	}

	//via brand
	public static Car searchBrand(ArrayList<Car> list, String brand){
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getBrand() == brand)
				return list.get(i);	//car found
		}
		return null; //car not found
	}
	//via brand but all occurrences
	public static ArrayList<Car> searchBrandAll(ArrayList<Car> list, String brand){
		ArrayList<Car> found = new ArrayList<Car>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getBrand() == brand)
				found.add(list.get(i));	//car found
		}
		return found;
	}
 
	//via model
	public static Car searchModel(ArrayList<Car> list, String model){
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getModel() == model)
				return list.get(i);	//car found
		}
		return null; //car not found
	}
	//via model but all occurrences
	public static ArrayList<Car> searchModelAll(ArrayList<Car> list, String model){
		ArrayList<Car> found = new ArrayList<Car>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getModel() == model)
				found.add(list.get(i));	//car found
		}
		return found;
	}
	
	//finds the file where the car is stored
	public static File getFile(Car car){	
		PathBuilder path = new PathBuilder(car.getTypeStr(), car.getBrand());
		File file = new File(path.getPath());
		return file;
	}
	//pass the list of cars of that brand and of that type plz
	public static void removeCarFromFile(ArrayList<Car> list, Car car) throws IOException{
		FileWriter file = new FileWriter(getFile(car));

		for(int i = 0; i < list.size(); i++){
			file.write(list.get(i).getCarID() + "\n");	//print id in file
		}

		file.close(); //might cause bugs if files work like magic in java

	}



}