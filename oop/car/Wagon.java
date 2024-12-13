package oop.car;

import java.util.ArrayList;
import oop.car.Car;
public class Wagon extends Car{
    private String tailgate;
    public static int attribCount = 9;
    public static int count = 0;
    
    public Wagon(ArrayList<String> attribs){
        super(attribs);

        setTailgate(attribs.get(8));
        count++;
    }
    public void setTailgate(String tailgate){
        this.tailgate = tailgate;
    }
    public String getTailgate(){
        return tailgate;
    }
}