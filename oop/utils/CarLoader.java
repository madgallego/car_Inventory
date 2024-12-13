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
import java.util.Iterator;


public class CarLoader{

	private static File f;
	private static Scanner scan;

	//returns an arraylist containing all cars within the object
	public static ArrayList<Car> load(String file_name) throws FileNotFoundException {	
		f = new File(file_name);
		scan = new Scanner(f);
		ArrayList<Car> cars = new ArrayList<Car>();
		
		while(scan.hasNextLine()){
			Car car = new Car(scan.nextLine());
			cars.add(car);
		}
		
		return cars;
	}

	// saves ArrayList of cars back into the file (used after transactions on the carList for safer adding or removal of car objects)
	public static void save(String file_name, ArrayList<Car> list) {	
		FileWritter file = new File(file_name);
		Iterator<Car> iterator = list.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
			file.write(car.getCarID() + "\n");	//print id in file
			//print all other atributes (ikaw na here lester ;D )
        }
	}
	
	//pass the list of cars of that brand and of that type plz
	public static void removeCarFromFile(ArrayList<Car> list, Car car) throws IOException{
		FileWriter file = new FileWriter(PathBuilder.getFile(car));

		for(int i = 0; i < list.size(); i++){
			file.write(list.get(i).getCarID() + "\n");	//print id in file
		}

		file.close(); //might cause bugs if files work like magic in java

	}



}