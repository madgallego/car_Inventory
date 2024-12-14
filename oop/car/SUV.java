package oop.car;

import java.util.ArrayList;
import oop.car.Car;

public class SUV extends Car{
    private String style; //a crossover/ b mini/ c compact/ d mid/ e full/ f extended/ g coupe
    public static int attribCount = 13;
    public SUV(ArrayList<String> attribs){
        super(attribs);
        
        setStyle(attribs.get(12));

    }
    public String getStyle(){
        return this.style;
    }
    public void setStyle(String style){
        this.style = style;
    }


}