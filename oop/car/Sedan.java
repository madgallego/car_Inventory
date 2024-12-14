package oop.car;


import java.util.ArrayList;
import oop.car.Car;
public class Sedan extends Car{
    private String style;    
    public static int attribCount = 11;

    public Sedan(ArrayList<String> attribs){
        super(attribs);

        setStyle(attribs.get(10));

    }
    public void setStyle(String style){
        this.style = style;
    }
    public String getStyle(){
        return style;
    }

}