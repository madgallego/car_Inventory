package oop.car;

import oop.car.Car;

public class Sedan extends Car{
    public String style;    
    public static int count;

    public Sedan(String ID){
        super(ID);
        count++;
    }
    public String getStyle(){
        return style;
    }

}