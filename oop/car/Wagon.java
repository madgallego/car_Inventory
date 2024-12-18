package oop.car;

import java.util.ArrayList;
public class Wagon extends Car{
    private String tailgate;
    public static int attribCount = 13;

    
    public Wagon(ArrayList<String> attribs){
        super(attribs);

        setTailgate(attribs.get(12));
    }
    public void setTailgate(String tailgate){
        this.tailgate = tailgate;
    }
    public String getTailgate(){
        return tailgate;
    }
}