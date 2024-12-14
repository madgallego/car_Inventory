package oop.car;

import java.util.ArrayList;
import oop.car.Car;

public class Truck extends Car{
    private String style;  //bed style. true for stepside, false for fleetside
    private String size;   //1 for kei, 2 for compact, 3 for mid-size, 4 for full-size
    public static int attribCount = 14;


    public Truck(ArrayList<String> attribs){
        super(attribs);
        setStyle(attribs.get(12));
        setSize(attribs.get(13));

    }   

    public void setStyle(String style){
        this.style = style;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getStyle(){
        return style;
    }
    public String getSize(){
        return size;
    }


}