import oop.ui.Renderer;
import oop.car.Car;
import oop.utils.CarLoader;
import java.util.ArrayList;

public class Main{

	public static void main(String args[]){
		Renderer window = new Renderer();
		window.display();

		ArrayList<Car> SUV = new ArrayList<Car>();
		try{
			SUV = CarLoader.load("SUV.txt");
		}
		catch(Exception e){
			System.out.println("File not found");
		}

		for(int i = 0; i < SUV.size(); i++){
			System.out.println(SUV.get(i).getCarID());
		
		}
		
	}


}