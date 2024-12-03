package oop.car;

import oop.car.Car;

public class Sedan extends Car{
    private String style;    
    public static int count = 0;

    public Sedan(String ID){
        super(ID);
        count++;
    }
    public void setStyle(String style){
        this.style = style;
    }
    public String getStyle(){
        return style;
    }

}