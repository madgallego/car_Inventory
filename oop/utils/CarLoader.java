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

	//loads ALL convertibles regardless of brand
	public static ArrayList<Convertible> loadAllConvertible(){
		ArrayList<Convertible> all = new ArrayList<Convertible>();	//contains all
		ArrayList<Convertible> temp;
		temp = loadConvertible("BMW");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));

		return all;
	}
	//saves all convertibles to their files
	public static void saveConvertible(ArrayList<Convertible> arr){
		int i = 0;
		int j = 0;
		while(j < arr.size()){
			ArrayList<Car> temp = new ArrayList<Car>();
			while(j < arr.size() && arr.get(i).getBrand().equals(arr.get(j).getBrand())){
				
				temp.add(arr.get(j));
				j++;
			}
			i = j;
			save(temp);
		}
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
	public static ArrayList<Coupe> loadAllCoupe(){
		ArrayList<Coupe> all = new ArrayList<Coupe>();	//contains all
		ArrayList<Coupe> temp;
		temp = loadCoupe("BMW");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadCoupe("Ford");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadCoupe("Toyota");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		return all;
	}
	//saves all Coupes to their files
	public static void saveCoupe(ArrayList<Coupe> arr){
		int i = 0;
		int j = 0;
		while(j < arr.size()){
			ArrayList<Car> temp = new ArrayList<Car>();
			while(j < arr.size() && arr.get(i).getBrand().equals(arr.get(j).getBrand())){
				
				temp.add(arr.get(j));
				j++;
			}
			i = j;
			save(temp);
		}
		

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
	public static ArrayList<Crossover> loadAllCrossover(){
		ArrayList<Crossover> all = new ArrayList<Crossover>();	//contains all
		ArrayList<Crossover> temp;
		temp = loadCrossover("Toyota");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		return all;
	}
	//saves all Crossovers to their files
	public static void saveCrossover(ArrayList<Crossover> arr){
		int i = 0;
		int j = 0;
		while(j < arr.size()){
			ArrayList<Car> temp = new ArrayList<Car>();
			while(j < arr.size() && arr.get(i).getBrand().equals(arr.get(j).getBrand())){
				
				temp.add(arr.get(j));
				j++;
			}
			i = j;
			save(temp);
		}
		

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
	public static ArrayList<EV> loadAllEV(){
		ArrayList<EV> all = new ArrayList<EV>();	//contains all
		ArrayList<EV> temp;
		temp = loadEV("BMW");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadEV("Honda");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadEV("Tesla");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		return all;
	}
	//saves all EVs to their files
	public static void saveEV(ArrayList<EV> arr){
		int i = 0;
		int j = 0;
		while(j < arr.size()){
			ArrayList<Car> temp = new ArrayList<Car>();
			while(j < arr.size() && arr.get(i).getBrand().equals(arr.get(j).getBrand())){
				
				temp.add(arr.get(j));
				j++;
			}
			i = j;
			save(temp);
		}
		

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

	public static ArrayList<Hatchback> loadAllHatchback(){
		ArrayList<Hatchback> all = new ArrayList<Hatchback>();	//contains all
		ArrayList<Hatchback> temp;
		temp = loadHatchback("Honda");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadHatchback("Mazda");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadHatchback("Toyota");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		return all;
	}
	//saves all Hatchbacks to their files
	public static void saveHatchback(ArrayList<Hatchback> arr){
		int i = 0;
		int j = 0;
		while(j < arr.size()){
			ArrayList<Car> temp = new ArrayList<Car>();
			while(j < arr.size() && arr.get(i).getBrand().equals(arr.get(j).getBrand())){
				
				temp.add(arr.get(j));
				j++;
			}
			i = j;
			save(temp);
		}
		

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

	public static ArrayList<Luxury> loadAllLuxury(){
		ArrayList<Luxury> all = new ArrayList<Luxury>();	//contains all
		ArrayList<Luxury> temp;
		temp = loadLuxury("BMW");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadLuxury("Toyota");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		return all;
	}
	//saves all Luxurys to their files
	public static void saveLuxury(ArrayList<Luxury> arr){
		int i = 0;
		int j = 0;
		while(j < arr.size()){
			ArrayList<Car> temp = new ArrayList<Car>();
			while(j < arr.size() && arr.get(i).getBrand().equals(arr.get(j).getBrand())){
				
				temp.add(arr.get(j));
				j++;
			}
			i = j;
			save(temp);
		}
		

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

	public static ArrayList<Minivan> loadAllMinivan(){
		ArrayList<Minivan> all = new ArrayList<Minivan>();	//contains all
		ArrayList<Minivan> temp;
		temp = loadMinivan("Suzuki");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		return all;
	}
	//saves all Minivans to their files
	public static void saveMinivan(ArrayList<Minivan> arr){
		int i = 0;
		int j = 0;
		while(j < arr.size()){
			ArrayList<Car> temp = new ArrayList<Car>();
			while(j < arr.size() && arr.get(i).getBrand().equals(arr.get(j).getBrand())){
				
				temp.add(arr.get(j));
				j++;
			}
			i = j;
			save(temp);
		}
		

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

	public static ArrayList<Sedan> loadAllSedan(){
		ArrayList<Sedan> all = new ArrayList<Sedan>();	//contains all
		ArrayList<Sedan> temp;
		temp = loadSedan("Honda");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadSedan("Mazda");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadSedan("Toyota");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		return all;
	}
	//saves all Sedans to their files
	public static void saveSedan(ArrayList<Sedan> arr){
		int i = 0;
		int j = 0;
		while(j < arr.size()){
			ArrayList<Car> temp = new ArrayList<Car>();
			while(j < arr.size() && arr.get(i).getBrand().equals(arr.get(j).getBrand())){
				
				temp.add(arr.get(j));
				j++;
			}
			i = j;
			save(temp);
		}
		

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

	public static ArrayList<SportsCar> loadAllSportsCar(){
		ArrayList<SportsCar> all = new ArrayList<SportsCar>();	//contains all
		ArrayList<SportsCar> temp;
		temp = loadSportsCar("Ford");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadSportsCar("Mazda");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadSportsCar("Toyota");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		return all;
	}
	//saves all SportsCars to their files
	public static void saveSportsCar(ArrayList<SportsCar> arr){
		int i = 0;
		int j = 0;
		while(j < arr.size()){
			ArrayList<Car> temp = new ArrayList<Car>();
			while(j < arr.size() && arr.get(i).getBrand().equals(arr.get(j).getBrand())){
				
				temp.add(arr.get(j));
				j++;
			}
			i = j;
			save(temp);
		}
		

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

	public static ArrayList<SUV> loadAllSUV(){
		ArrayList<SUV> all = new ArrayList<SUV>();	//contains all
		ArrayList<SUV> temp;
		temp = loadSUV("Ford");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadSUV("Honda");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadSUV("Mazda");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadSUV("Toyota");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		return all;
	}
	//saves all SUVs to their files
	public static void saveSUV(ArrayList<SUV> arr){
		int i = 0;
		int j = 0;
		while(j < arr.size()){
			ArrayList<Car> temp = new ArrayList<Car>();
			while(j < arr.size() && arr.get(i).getBrand().equals(arr.get(j).getBrand())){
				
				temp.add(arr.get(j));
				j++;
			}
			i = j;
			save(temp);
		}
		

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

	public static ArrayList<Truck> loadAllTruck(){
		ArrayList<Truck> all = new ArrayList<Truck>();	//contains all
		ArrayList<Truck> temp;
		temp = loadTruck("Ford");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadTruck("Mazda");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadTruck("Toyota");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		return all;
	}
	//saves all Trucks to their files
	public static void saveTruck(ArrayList<Truck> arr){
		int i = 0;
		int j = 0;
		while(j < arr.size()){
			ArrayList<Car> temp = new ArrayList<Car>();
			while(j < arr.size() && arr.get(i).getBrand().equals(arr.get(j).getBrand())){
				
				temp.add(arr.get(j));
				j++;
			}
			i = j;
			save(temp);
		}
		

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

	public static ArrayList<Wagon> loadAllWagon(){
		ArrayList<Wagon> all = new ArrayList<Wagon>();	//contains all
		ArrayList<Wagon> temp;

		temp = loadWagon("Mazda");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		temp = loadWagon("Toyota");
		for(int i = 0; i < temp.size(); i++)
			all.add(temp.get(i));
		return all;
	}
	//saves all Wagons to their files
	public static void saveWagon(ArrayList<Wagon> arr){
		int i = 0;
		int j = 0;
		while(j < arr.size()){
			ArrayList<Car> temp = new ArrayList<Car>();
			while(j < arr.size() && arr.get(i).getBrand().equals(arr.get(j).getBrand())){
				
				temp.add(arr.get(j));
				j++;
			}
			i = j;
			save(temp);
		}
		

	}







	// saves ArrayList of cars back into the file (used after transactions on the carList for safer adding or removal of car objects)
	public static void save(ArrayList<Car> list){	
		try{
			FileWriter file = new FileWriter(PathBuilder.getFile(list.get(0).getType(), list.get(0).getBrand()));
			Iterator<Car> iterator = list.iterator();
			while (iterator.hasNext()) {
				Car car = iterator.next();
				System.out.println(car.getBrand());
				for(int i = 0; i < car.attribs.size(); i++)
					file.write(car.attribs.get(i) + "\n");	
			}
			file.close();
		}catch(IOException e){
			System.err.println("File Not Found");
		}
	}
	




}