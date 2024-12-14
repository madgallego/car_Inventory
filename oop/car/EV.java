package oop.car;

import java.util.ArrayList;
import oop.car.Car;
public class EV extends Car{
    private int range;  //mileage before out of battery
    private String connector; //a for type 1, b for type 2, c for wireless
    private int batteryLife;    //battery life before it needs to be swapped/replaced
    public static int attribCount = 14;

    public EV(ArrayList<String> attribs){
        super(attribs);

        setRange(Integer.parseInt(attribs.get(11)));
        setConnector(attribs.get(12));
        setBatteryLife(Integer.parseInt(attribs.get(13)));
    }
    public int getRange(){
        return range;
    }
    public void setRange(int range){
        this.range = range;
    }
    public void setConnector(String connector){
        this.connector = connector;
    }
    public void setBatteryLife(int batteryLife){
        this.batteryLife = batteryLife;
    }
    public int getRangeKMS(){
        return (int) ((float) range * 1.6);
    }
    public String getConnector(){
        return connector;
    }
    public int getBatteryLife(){
        return batteryLife;
    }
    public int getBatteryLifeKMS(){
        return (int) (((float) batteryLife )* 1.6);
    }
}