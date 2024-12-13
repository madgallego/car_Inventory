package oop.car;

import java.util.ArrayList;
import oop.car.Car;
public class Crossover extends Car{
    private int size;   //1 for city car, 2 for subcompact, 3 for compact, 4 for mid size, 5 for full size
    private int style;  //0 for default, 1 for three-door, 2 for coupe, 3 for convertible
    public static int count = 0;
    
    public Crossover(ArrayList<String> attribs){
        super(attribs);
        attribCount = 10;
        setSize(Integer.parseInt(attribs.get(8)));
        setStyle(Integer.parseInt(attribs.get(9)));
        count++;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setStyle(int style){
        this.style = style;
    }
    public String getSizeStr(){ //return size as string
        switch(size){
            case 1:
                return "City Car";
            case 2:
                return "Subcompact";
            case 3:
                return "Compact";
            case 4:
                return "Mid-size";
            case 5:
                return "Full Size";
            default:
                return "null";
        }
    }
    public int getStyle(){
        return style;
    }
    public String getStyleStr(){
        switch(style){
            case 0:
                return "Default";
            case 1:
                return "Three-door";
            case 2:
                return "Coupe";
            case 3:
                return "Convertible";
            default:
                return "null";

        }
    }


}