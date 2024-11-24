package oop.car;

import oop.car.Car;

public class Microcar extends Car{
    private int wheels; //some have 3
    public static int count = 0;

    public Microcar(String ID){
        super(ID);
        count++;
    }
    public int getWheels(){
        return wheels;
    }
}