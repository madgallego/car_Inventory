package oop.car;

import java.util.ArrayList;
import oop.car.Car;
public class Convertible extends Car{
    private int roofType;   //0 for textile, 1 for detachable hardtop, 2 for retractable hardtop
    public static int count = 0;
    public static int attribCount = 9;
    public Convertible(ArrayList<String> attribs){
        super(attribs);
        setRoofType(Integer.parseInt(attribs.get(8)));
        count++;
    }
    public int getRoofType(){
        return roofType;
    }
    public void setRoofType(int roofType){
        this.roofType = roofType;
    }
}