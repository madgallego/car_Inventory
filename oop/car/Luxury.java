package oop.car;

import java.util.ArrayList;
import oop.car.Car;
public class Luxury extends Car{
    private String category;  //a for compact executive, b for executive, c for Luxury saloon, d for ultra luxury, e for grand tourer
    //f for luxury suv, g for luxury mpv
    public static int attribCount = 11;

    public Luxury(ArrayList<String> attribs){
        super(attribs);

        setCategory(attribs.get(10));
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return category;
    }
    

}