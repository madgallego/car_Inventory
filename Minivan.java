package oop.car;

import oop.car.Car;

public class Minivan extends Car{
    private boolean mini;   //if true, its mini mpv, if false, then its compact mpv
    private static int count = 0;
    
    public Minivan(String ID){
        super(ID);
        count++;
    }
    public boolean isMini(){
        return mini;
    }
}