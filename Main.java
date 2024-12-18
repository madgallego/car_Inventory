import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import oop.car.Car;
import oop.car.Convertible;
import oop.ui.DashboardUI;
import oop.utils.CarLoader;

public class Main{

	public static void main(String args[]) throws FileNotFoundException{
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        try {
                            UIManager.setLookAndFeel(info.getClassName());
                        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                                 | UnsupportedLookAndFeelException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }

                new DashboardUI(1, "BMW");
            }
        });
		
		 
		ArrayList<Convertible> c = CarLoader.loadConvertible("BMW");
        //Transaction.restock(c.get(0));
        ArrayList<Car> cars = new ArrayList<Car>();

        for(int i = 0; i < c.size(); i++){
            cars.add(c.get(i));
        }
        for(int i = 0; i < cars.size(); i++){
            for(int j = 0; j < cars.get(i).attribs.size(); j++){
                System.out.println(cars.get(i).attribs.get(j));
            }
        }
        CarLoader.save(cars);
        
	} 


}

/* 
import java.io.FileNotFoundException;
import java.util.ArrayList;
import oop.car.*;
import oop.utils.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "oop\\database\\SUV.txt"; // Path to the file
        
        try {
            // Initialize Transaction object
            Transaction transaction = new Transaction(filePath);

            // Display initial cars
            System.out.println("\nInitial list of cars:");
            transaction.displayCars();

            // Create a new car (SUV in this case) and add it
            Car newCar = new SUV("PAF03MX30157913"); // Example car object
            transaction.addCar(newCar);

            // Display updated cars list
            System.out.println("\nUpdated list of cars:");
            transaction.displayCars();

            // Remove a car by ID
            transaction.removeCar("PAF03MX30157913");

            // Display updated cars list again
            System.out.println("\nUpdated list of cars after removal:");
            transaction.displayCars();

        } catch (FileNotFoundException e) {
            System.out.println("\nFile not found: " + filePath);
        }
    }
}
*/