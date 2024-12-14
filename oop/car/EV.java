package oop.car;

import java.util.ArrayList;
import oop.car.Car;
public class EV extends Car{
    private int range;  //mileage before out of battery
    private char connector; //a for type 1, b for type 2, c for wireless
    private int batteryLife;    //battery life before it needs to be swapped/replaced
    public static int attribCount = 11;

    public EV(ArrayList<String> attribs){
        super(attribs);

        setRange(Integer.parseInt(attribs.get(8)));
        setConnector(attribs.get(9).charAt(0));
        setBatteryLife(Integer.parseInt(attribs.get(10)));
    }
    public int getRange(){
        return range;
    }
    public void setRange(int range){
        this.range = range;
    }
    public void setConnector(char connector){
        this.connector = connector;
    }
    public void setBatteryLife(int batteryLife){
        this.batteryLife = batteryLife;
    }
    public int getRangeKMS(){
        return (int) ((float) range * 1.6);
    }
    public char getConnector(){
        return connector;
    }
    public String getConnectorStr(){
        switch(connector){
            case 'a':
                return "Type 1";
            case 'b':
                return "Type 2";
            case 'c':
                return "Wireless/Electric Road";
            default:
                return "null";

        }
    }
    public int getBatteryLife(){
        return batteryLife;
    }
    public int getBatteryLifeKMS(){
        return (int) (((float) batteryLife )* 1.6);
    }
}