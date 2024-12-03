package oop.car;

import oop.car.Car;

public class Hybrid extends Car{
    private char config;    //a for parallel, b for mild parallel, c for power-split, d for series, e for plug-in
    private int range;  //mileage before out of battery
    private char connector; //a for type 1, b for type 2, c for wireless
    private int batteryLife;    //battery life before it needs to be swapped/replaced
    public static int count = 0;

    public Hybrid(String ID){
        super(ID);
        count++;
    }
    public void setConfig(char config){
        this.config = config;
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
    public int getRange(){
        return range;
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
    public char getConfig(){
        return config;
    }
    public String getConfigStr(){
        switch(config){
            case 'a':
                return "Parallel";
            case 'b':
                return "Mild Parallel";
            case 'c':
                return "Power-split";
            case 'd':
                return "Series";
            case 'e':
                return "Plug-in";
            default:
                return "Null";

        }
    }
}