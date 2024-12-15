package oop.car;

import java.util.ArrayList;
import oop.car.Car;
public class Convertible extends Car{
    private String roofType;   
    public static int attribCount = 13;
    public Convertible(ArrayList<String> attribs){
        super(attribs);
        setRoofType(attribs.get(12));
    }
    public String getRoofType(){
        return roofType;
    }
    public void setRoofType(String roofType){
        this.roofType = roofType;
    }
}