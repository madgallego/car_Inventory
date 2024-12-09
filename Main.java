import java.io.FileNotFoundException;
import java.util.ArrayList;
import oop.car.Car;
import oop.ui.*;
import oop.utils.*;


public class Main{

	public static void main(String args[]){
		//Renderer window = new Renderer();
		//window.display();

		StartUI begin = new StartUI();

		//sample pathbuilder utilization
		//best to use switches for arguments
		PathBuilder path = new PathBuilder("SUV", "PAF" );
		String filename = path.getPath();

		ArrayList<Car> SUV = new ArrayList<Car>();
		try{
			SUV = CarLoader.load(filename);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}

		for(int i = 0; i < SUV.size(); i++){
			System.out.println(SUV.get(i).getCarID());
			System.out.println(SUV.get(i).getPrice());
			System.out.println(SUV.get(i).getBrand());
			System.out.println(SUV.get(i).getType());
			System.out.println(SUV.get(i).getModel());
			//System.out.println(SUV.get(i).getCount());
		}
		
	}


}