package oop.utils;

import oop.car.Car;
import java.io.File;
import java.io.IOException;
public class PathBuilder {
		private static String path; 
		String carType;
		String carBrand;
		
	public PathBuilder(String carType, String carBrand) {
		this.carType=carType;
		this.carBrand=carBrand;
		path = "././oop/database/";
		setPath();
	}
	
	private void setPath (){
		path = path+carType+"/"+ carBrand +".txt";
	}
	
	public String getPath() {
		return path;
	}

	public static File makeFile(String path) throws IOException{
		File file = new File(path);
		return file;
	}

	//finds the file where the car is stored
	public static File getFile(String type, String brand){	
		PathBuilder path = new PathBuilder(type, brand);
		System.out.println(path.path);
		File file;
		try{
			file = makeFile(path.path);
			System.out.println("x");
		}
		catch(IOException e){
			System.err.println("File Not Found");
			return null;
		}
		return file;
	}
	
}