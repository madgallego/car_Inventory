package oop.car;

public class SUV extends Car{
    private boolean offroad;
    private String style;
    public static int count = 0;
    public SUV(String ID){
        super(ID);
        count++;
    }
    public void setOffRoad(boolean offroad){
        this.offroad = offroad;
    }
    public boolean getOffRoad(){
        return this.offroad;
    }
    public String getStyle(){
        return this.style;
    }

}