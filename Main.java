import oop.ui.Renderer;
import oop.car.Car;
import oop.utils.CarLoader;
import java.util.ArrayList;
import oop.car.SUV;
import java.io.FileNotFoundException;

public class Main{

	public static void main(String args[]){
		Renderer window = new Renderer();
		window.display();

		ArrayList<Car> SUV = new ArrayList<Car>();
		try{
			SUV = CarLoader.load("SUV.txt");
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
			System.out.println(SUV.get(i).getCount());
		}
		
	}


}