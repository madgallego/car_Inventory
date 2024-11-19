import oop.ui.Renderer;
import oop.car.Car;
import oop.utils.CarLoader;
import java.util.ArrayList;
import oop.car.SUV;

public class Main{

	public static void main(String args[]){
		Renderer window = new Renderer();
		window.display();

		ArrayList<SUV> SUV = new ArrayList<SUV>();
		try{
			SUV = CarLoader.SUVload("SUV.txt");
		}
		catch(Exception e){
			System.out.println("File not found");
		}

		for(int i = 0; i < SUV.size(); i++){
			System.out.println(SUV.get(i).getCarID());
			System.out.println(SUV.get(i).getOffRoad());
		}
		
	}


}