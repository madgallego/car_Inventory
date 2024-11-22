package oop.car;

import oop.car.Car;

public class SUV extends Car{
    private boolean offroad;
    private String style;
    public static int count = 0;
    public SUV(String ID){
        super(ID);
        count++;
    }
    public boolean getOffRoad(){
        return this.offroad;
    }
    public String getStyle(){
        return this.style;
    }

}