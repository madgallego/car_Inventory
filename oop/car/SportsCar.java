package oop.car;

import java.util.ArrayList;
import oop.car.Car;
public class SportsCar extends Car{
    private String seatLayout;  //a for roadster, b for 2+2
    public static int attribCount = 12;


    public SportsCar(ArrayList<String> attribs){
        super(attribs);

        setSeatLayout(attribs.get(11));
    }
    public void setSeatLayout(String seatLayout){
        this.seatLayout = seatLayout;
    }
    public String getSeatLayout(){
        return seatLayout;
    }

   
}