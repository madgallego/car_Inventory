package oop.car;

public class SportsCar extends Car{
    private char seatLayout;  //a for roadster, b for 2+2
    public static int count = 0;

    public SportsCar(String ID){
        super(ID);
        count++;
    }
    public void setSeatLayout(char seatLayout){
        this.seatLayout = seatLayout;
    }
    public char getSeatLayout(){
        return seatLayout;
    }
    public String getSeatLayoutStr(){   //return seat layout as string
        if(seatLayout == 'a'){
            return "Roadster";
        }
        return "2+2";
    }
   
}