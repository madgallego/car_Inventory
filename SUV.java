package oop.car;

import oop.car.Car;

public class SUV extends Car{
    private boolean offroad = true;
    public static int count = 0;
    public SUV(String ID){
        super(ID);
        count++;
    }
    public boolean getOffRoad(){
        return this.offroad;
    }

}