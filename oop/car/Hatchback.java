package oop.car;
import java.util.ArrayList;
import oop.car.Car;
public class Hatchback extends Car{
    private String boxDesign;    //1 for estate, 2 for liftback, 3 for notchback
    public static int attribCount = 12;


    public Hatchback(ArrayList<String> attribs){
        super(attribs);

        setBoxDesign(attribs.get(11));

    }

    public void setBoxDesign(String boxDesign){
        this.boxDesign = boxDesign;
    }
    
    public String getBoxDesign(){
        return boxDesign;
    }
}