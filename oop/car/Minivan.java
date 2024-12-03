package oop.car;

public class Minivan extends Car{
    private boolean mini;   //if true, its mini mpv, if false, then its compact mpv
    public static int count = 0;
    
    public Minivan(String ID){
        super(ID);
        count++;
    }
    public boolean isMini(){
        return mini;
    }
    public void setMini(boolean mini){
        this.mini = mini;
    }
    public String getVanType(){
        if(mini){
            return "Mini";
        }
        else
            return "Compact";
    }
}