package oop.car;

public class SUV extends Car{
    private boolean offroad;
    private char style; //a crossover/ b mini/ c compact/ d mid/ e full/ f extended/ g coupe
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