package oop.car;

import oop.car.Car;

public class Wagon extends Car{
    private String tailgate;
    public static int count = 0;
    
    public Wagon(String ID){
        super(ID);
        count++;
    }
    public void setTailgate(String tailgate){
        this.tailgate = tailgate;
    }
    public String getTailgate(){
        return tailgate;
    }
}