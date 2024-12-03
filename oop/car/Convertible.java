package oop.car;

public class Convertible extends Car{
    private int roofType;   //0 for textile, 1 for detachable hardtop, 2 for retractable hardtop
    private static int count = 0;
    public Convertible(String ID){
        super(ID);
        count++;
    }
    public int getRoofType(){
        return roofType;
    }
    public void setRoofType(int roofType){
        this.roofType = roofType;
    }
}