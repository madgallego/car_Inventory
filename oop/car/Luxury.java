package oop.car;

public class Luxury extends Car{
    private char category;  //a for compact executive, b for executive, c for Luxury saloon, d for ultra luxury, e for grand tourer
    //f for luxury suv, g for luxury mpv
    public static int count = 0;

    public Luxury(String ID){
        super(ID);
        count++;
    }
    public void setCategory(char category){
        this.category = category;
    }
    public char getCategory(){
        return category;
    }
    public String getCategoryStr(){
        switch(category){
            case 'a':
                return "Compact Executive";
            case 'b':
                return "Executive";
            case 'c':
                return "Luxury Saloon";
            case 'd':
                return "Ultra-luxury";
            case 'e':
                return "Grand Tourer";
            case 'f':
                return "Luxury SUV";
            case 'g':
                return "Luxury MPV";
            default:
                return "null";
        }
    }
    

}