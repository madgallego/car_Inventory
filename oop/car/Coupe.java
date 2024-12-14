package oop.car;

import java.util.ArrayList;
import oop.car.Car;
public class Coupe extends Car{
    private boolean rear;   //if it has seats at the back
    private int doors;  //specifies door count, typically 2
    private String style;
    public static int attribCount = 14;

    public Coupe(ArrayList<String> attribs){
        super(attribs);
        setRear(Boolean.parseBoolean(attribs.get(12)));
        setDoors(Integer.parseInt(attribs.get(13)));
    }

    public boolean getRear(){
        return rear;
    }
    public void setRear(boolean rear){
        this.rear = rear;
    }
    public int getDoors(){
        return doors;
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public String getStyle(){
        return style;
    }
    public void setStyle(String style){
        this.style = style; 
    }
}