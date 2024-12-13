package oop.car;


import java.util.ArrayList;
import oop.car.Car;
public class Sedan extends Car{
    private String style;    
    public static int count = 0;

    public Sedan(ArrayList<String> attribs){
        super(attribs);
        attribCount = 9;
        setStyle(attribs.get(8));
        count++;
    }
    public void setStyle(String style){
        this.style = style;
    }
    public String getStyle(){
        return style;
    }

}