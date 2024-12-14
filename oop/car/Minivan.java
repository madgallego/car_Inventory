package oop.car;

import java.util.ArrayList;
import oop.car.Car;

public class Minivan extends Car{
    private boolean mini;   //if true, its mini mpv, if false, then its compact mpv
    public static int attribCount = 9;

    
    public Minivan(ArrayList<String> attribs){
        super(attribs);

        setMini(Boolean.parseBoolean(attribs.get(8)));

    }
    public boolean isMini(){
        return mini;
    }
    public void setMini(boolean mini){
        this.mini = mini;
    }
    public String getVanType(){
        if(mini){
            return "Mini";
        }
        else
            return "Compact";
    }
}