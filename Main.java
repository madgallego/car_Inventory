import java.io.FileNotFoundException;
import java.util.ArrayList;
import oop.car.Car;
import oop.utils.CarLoader;

public class Main{

	public static void main(String args[]){
		//Renderer window = new Renderer();
		//window.display();

		ArrayList<Car> SUV = new ArrayList<Car>();
		try{
			SUV = CarLoader.load("C:\\Users\\Test\\Documents\\My Java Programs\\car_Inventory\\oop\\database\\SUV.txt");
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