//used for final testing!!
import oop.car.*;
import oop.utils.*;
import java.util.ArrayList;

public class Lester{
    public static void main(String [] args){
        ArrayList<Coupe> c = CarLoader.loadAllCoupe();
        for(int i = 0; i < c.size(); i++){
            System.out.println(c.get(i).getBrand());
        }
        System.out.print(c.get(0).getBrand().equals(c.get(1).getBrand()));
        CarLoader.saveCoupe(c);
    }
}

