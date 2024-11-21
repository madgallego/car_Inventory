package oop.car;

import oop.car.Car;

public class Coupe extends Car{
    private boolean rear;   //if it has seats at the back
    private int doors;  //specifies door count, typically 2
    private String style;
    private static int count = 0;

    public Coupe(String ID){
        super(ID);
        count++;
    }

    public boolean getRear(){
        return rear;
    }
    public int getDoors(){
        return doors;
    }
    public String getStyle(){
        return style;
    }
    
}