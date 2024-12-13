package oop.car;
import java.util.ArrayList;
import oop.car.Car;
public class Hatchback extends Car{
    private boolean threeDoor;  //if its false, then it is automatically a five door hatchback
    private int boxDesign;    //1 for estate, 2 for liftback, 3 for notchback
    public static int count = 0;

    public Hatchback(ArrayList<String> attribs){
        super(attribs);
        attribCount = 10;
        setThreeDoor(Boolean.parseBoolean(attribs.get(8)));
        setBoxDesign(Integer.parseInt(attribs.get(9)));
        count++;
    }
    public void setThreeDoor(boolean threeDoor){
        this.threeDoor = threeDoor;
    }
    public void setBoxDesign(int boxDesign){
        this.boxDesign = boxDesign;
    }
    
    public boolean isThreeDoor(){
        return threeDoor;
    }
    public String isThreeDoorString(){  //returns door layout as string
        if(threeDoor)
            return "Three-door";
        return "Five-door";
    }
    public int getBoxDesign(){
        return boxDesign;
    }
    public String getBoxDesignString(){
        if(boxDesign == 1)
            return "Estate";
        else if(boxDesign == 2)
            return "Liftback";
        else
            return "Notchback";
    }
}