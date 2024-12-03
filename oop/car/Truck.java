package oop.car;

public class Truck extends Car{
    private boolean style;  //bed style. true for stepside, false for fleetside
    private int size;   //1 for kei, 2 for compact, 3 for mid-size, 4 for full-size
    public static int count = 0;

    public Truck(String ID){
        super(ID);
        count++;
    }   

    public void setStyle(boolean style){
        this.style = style;
    }
    public void setSize(int size){
        this.size = size;
    }
    public boolean getStyle(){
        return style;
    }
    public String getStyleString(){ //returns style as a string
        if(style)
            return "Stepside";
        return "Fleetside";
    }
    public int getSize(){
        return size;
    }
    public String getSizeString(){  //returns size as a string
        switch(size){
            case 1:
                return "Kei";
            case 2:
                return "Compact";
            case 3:
                return "Mid-size";
            case 4:
                return "Full-size";
            default:
                return "Null";
        }
    }

}