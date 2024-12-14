package oop.car;

import java.util.ArrayList;
import oop.car.Car;
public class Crossover extends Car{
    private String size;   //1 for city car, 2 for subcompact, 3 for compact, 4 for mid size, 5 for full size
    private String style;  //0 for default, 1 for three-door, 2 for coupe, 3 for convertible
    public static int attribCount = 13;
    
    public Crossover(ArrayList<String> attribs){
        super(attribs);
        setSize(attribs.get(11));
        setStyle(attribs.get(12));
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
    public void setStyle(String style){
        this.style = style;
    }
   
    public String getStyle(){
        return style;
    }
    


}