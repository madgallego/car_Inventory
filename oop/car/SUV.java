package oop.car;

import java.util.ArrayList;
import oop.car.Car;

public class SUV extends Car{
    private char style; //a crossover/ b mini/ c compact/ d mid/ e full/ f extended/ g coupe
    public static int count = 0;
    public SUV(ArrayList<String> attribs){
        super(attribs);
        attribCount = 9;
        setStyle(attribs.get(8).charAt(0));
        count++;
    }
    public char getStyle(){
        return this.style;
    }
    public void setStyle(char style){
        this.style = style;
    }
    public String getStyleStr(){
        switch(style){
            case 'a':
                return "Crossover";
            case 'b':
                return "Mini";
            case 'c':
                return "Compact";
            case 'd':
                return "Mid";
            case 'e':
                return "Full";
            case 'f':
                return "Extended-lenght";
            case 'g':
                return "Coupe";
            default:
                return "null";
        }
    }

}