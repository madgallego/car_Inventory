package oop.car;

import oop.car.Car;

public class SportsCar extends Car{
    private char seatLayout;  //a for roadster, b for 2+2
    private char engineLayout; //a for FR, b for MR, c for FF, d for MF
    public static int count = 0;

    public SportsCar(String ID){
        super(ID);
        count++;
    }
    public char getSeatLayout(){
        return seatLayout;
    }
    public String getSeatLayoutStr(){   //return seat layout as string
        if(seatLayout == 'a'){
            return "Roadster";
        }
        return "2+2";
    }
    public char getEngineLayout(){
        return engineLayout;
    }
    public String getEngineLayoutStr(){
        switch(engineLayout){
            case 'a':
                return "FR";
            case 'b':
                return "MR";
            case 'c':
                return "FR";
            case 'd':
                return "MF";
            default:
                return "null";
        }
    }
}