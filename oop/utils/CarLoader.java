package oop.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import oop.car.*;
import oop.utils.PathBuilder;
import java.io.FileWriter;
import java.util.Iterator;


public class CarLoader{

	private static File f;
	private static Scanner scan;

	// Car Loaders, differentiated by Type
	public static ArrayList<Convertible> loadConvertible(String brand){
		
		File file = PathBuilder.getFile("Convertible", brand);
		Scanner scan;
		try{
			scan = new Scanner(file);
		}catch(IOException e){
			System.err.println("File not Found");

			return null;
		}

		ArrayList<Convertible> con = new ArrayList<Convertible>();
		while(scan.hasNextLine()){
			ArrayList<String> attrib = new ArrayList<String>();
			for(int i = 0; i < Convertible.attribCount; i++){
				attrib.add(scan.nextLine());
			}
			Convertible c = new Convertible(attrib);
			con.add(c);
		}
		return con;
	}
	public static ArrayList<Coupe> loadCoupe(String brand){
		
		File file = PathBuilder.getFile("Coupe", brand);
		Scanner scan;
		try{
			scan = new Scanner(file);
		}catch(IOException e){
			System.err.println("File not Found");

			return null;
		}

		ArrayList<Coupe> con = new ArrayList<Coupe>();
		while(scan.hasNextLine()){
			ArrayList<String> attrib = new ArrayList<String>();
			for(int i = 0; i < Coupe.attribCount; i++){
				attrib.add(scan.nextLine());
			}
			Coupe c = new Coupe(attrib);
			con.add(c);
		}
		return con;
	}
	public static ArrayList<Crossover> loadCrossover(String brand){
		
		File file = PathBuilder.getFile("Crossover", brand);
		Scanner scan;
		try{
			scan = new Scanner(file);
		}catch(IOException e){
			System.err.println("File not Found");

			return null;
		}

		ArrayList<Crossover> con = new ArrayList<Crossover>();
		while(scan.hasNextLine()){
			ArrayList<String> attrib = new ArrayList<String>();
			for(int i = 0; i < Crossover.attribCount; i++){
				attrib.add(scan.nextLine());
			}
			Crossover c = new Crossover(attrib);
			con.add(c);
		}
		return con;
	}
	public static ArrayList<EV> loadEV(String brand){
		
		File file = PathBuilder.getFile("EV", brand);
		Scanner scan;
		try{
			scan = new Scanner(file);
		}catch(IOException e){
			System.err.println("File not Found");

			return null;
		}

		ArrayList<EV> con = new ArrayList<EV>();
		while(scan.hasNextLine()){
			ArrayList<String> attrib = new ArrayList<String>();
			for(int i = 0; i < EV.attribCount; i++){
				attrib.add(scan.nextLine());
			}
			EV c = new EV(attrib);
			con.add(c);
		}
		return con;
	}
	public static ArrayList<Hatchback> loadHatchback(String brand){
		
		File file = PathBuilder.getFile("Hatchback", brand);
		Scanner scan;
		try{
			scan = new Scanner(file);
		}catch(IOException e){
			System.err.println("File not Found");

			return null;
		}

		ArrayList<Hatchback> con = new ArrayList<Hatchback>();
		while(scan.hasNextLine()){
			ArrayList<String> attrib = new ArrayList<String>();
			for(int i = 0; i < Hatchback.attribCount; i++){
				attrib.add(scan.nextLine());
			}
			Hatchback c = new Hatchback(attrib);
			con.add(c);
		}
		return con;
	}

	public static ArrayList<Luxury> loadLuxury(String brand){
		
		File file = PathBuilder.getFile("Luxury", brand);
		Scanner scan;
		try{
			scan = new Scanner(file);
		}catch(IOException e){
			System.err.println("File not Found");

			return null;
		}

		ArrayList<Luxury> con = new ArrayList<Luxury>();
		while(scan.hasNextLine()){
			ArrayList<String> attrib = new ArrayList<String>();
			for(int i = 0; i < Luxury.attribCount; i++){
				attrib.add(scan.nextLine());
			}
			Luxury c = new Luxury(attrib);
			con.add(c);
		}
		return con;
	}
	public static ArrayList<Minivan> loadMinivan(String brand){
		
		File file = PathBuilder.getFile("Minivan", brand);
		Scanner scan;
		try{
			scan = new Scanner(file);
		}catch(IOException e){
			System.err.println("File not Found");

			return null;
		}

		ArrayList<Minivan> con = new ArrayList<Minivan>();
		while(scan.hasNextLine()){
			ArrayList<String> attrib = new ArrayList<String>();
			for(int i = 0; i < Minivan.attribCount; i++){
				attrib.add(scan.nextLine());
			}
			Minivan c = new Minivan(attrib);
			con.add(c);
		}
		return con;
	}

	public static ArrayList<Sedan> loadSedan(String brand){
		
		File file = PathBuilder.getFile("Sedan", brand);
		Scanner scan;
		try{
			scan = new Scanner(file);
		}catch(IOException e){
			System.err.println("File not Found");

			return null;
		}

		ArrayList<Sedan> con = new ArrayList<Sedan>();
		while(scan.hasNextLine()){
			ArrayList<String> attrib = new ArrayList<String>();
			for(int i = 0; i < Sedan.attribCount; i++){
				attrib.add(scan.nextLine());
			}
			Sedan c = new Sedan(attrib);
			con.add(c);
		}
		return con;
	}

	public static ArrayList<SportsCar> loadSportsCar(String brand){
		
		File file = PathBuilder.getFile("SportsCar", brand);
		Scanner scan;
		try{
			scan = new Scanner(file);
		}catch(IOException e){
			System.err.println("File not Found");

			return null;
		}

		ArrayList<SportsCar> con = new ArrayList<SportsCar>();
		while(scan.hasNextLine()){
			ArrayList<String> attrib = new ArrayList<String>();
			for(int i = 0; i < SportsCar.attribCount; i++){
				attrib.add(scan.nextLine());
			}
			SportsCar c = new SportsCar(attrib);
			con.add(c);
		}
		return con;
	}

	public static ArrayList<SUV> loadSUV(String brand){
		
		File file = PathBuilder.getFile("SUV", brand);
		Scanner scan;
		try{
			scan = new Scanner(file);
		}catch(IOException e){
			System.err.println("File not Found");

			return null;
		}

		ArrayList<SUV> con = new ArrayList<SUV>();
		while(scan.hasNextLine()){
			ArrayList<String> attrib = new ArrayList<String>();
			for(int i = 0; i < SUV.attribCount; i++){
				attrib.add(scan.nextLine());
			}
			SUV c = new SUV(attrib);
			con.add(c);
		}
		return con;
	}

	public static ArrayList<Truck> loadTruck(String brand){
		
		File file = PathBuilder.getFile("Truck", brand);
		Scanner scan;
		try{
			scan = new Scanner(file);
		}catch(IOException e){
			System.err.println("File not Found");

			return null;
		}

		ArrayList<Truck> con = new ArrayList<Truck>();
		while(scan.hasNextLine()){
			ArrayList<String> attrib = new ArrayList<String>();
			for(int i = 0; i < Truck.attribCount; i++){
				attrib.add(scan.nextLine());
			}
			Truck c = new Truck(attrib);
			con.add(c);
		}
		return con;
	}

	public static ArrayList<Wagon> loadWagon(String brand){
		
		File file = PathBuilder.getFile("Wagon", brand);
		Scanner scan;
		try{
			scan = new Scanner(file);
		}catch(IOException e){
			System.err.println("File not Found");

			return null;
		}

		ArrayList<Wagon> con = new ArrayList<Wagon>();
		while(scan.hasNextLine()){
			ArrayList<String> attrib = new ArrayList<String>();
			for(int i = 0; i < Wagon.attribCount; i++){
				attrib.add(scan.nextLine());
			}
			Wagon c = new Wagon(attrib);
			con.add(c);
		}
		return con;
	}







	// saves ArrayList of cars back into the file (used after transactions on the carList for safer adding or removal of car objects)
	public static void save(ArrayList<Car> list){	
		try{
			FileWriter file = new FileWriter(PathBuilder.getFile(list.get(0).getType(), list.get(0).getBrand()));
			Iterator<Car> iterator = list.iterator();
			while (iterator.hasNext()) {
				Car car = iterator.next();
				for(int i = 0; i < car.attribs.size(); i++)
					file.write(car.attribs.get(i) + "\n");	
			}
		}catch(IOException e){
			System.err.println("File Not Found");
		}
	}
	




}