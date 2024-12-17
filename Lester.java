//used for final testing!!
import oop.car.*;
import oop.utils.*;
import java.util.ArrayList;

public class Lester{
    public static void main(String [] args){
        ArrayList<Convertible> c = CarLoader.loadAllConvertible();
        for(int i = 0; i < c.size(); i++){
            for(int j = 0; j < Convertible.attribCount; j++)
                System.out.println(c.get(i).attribs.get(j));
        }
    }
}

