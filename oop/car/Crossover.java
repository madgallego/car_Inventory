package oop.car;
import java.io.*;
import java.util.*;
import oop.utils.PathBuilder;
public class Crossover extends Car{
    private int size;   //1 for city car, 2 for subcompact, 3 for compact, 4 for mid size, 5 for full size
    private int style;  //0 for default, 1 for three-door, 2 for coupe, 3 for convertible
    public static int count = 0;
    
    public Crossover(String ID){
        super(ID);
        count++;
    }
    public void build() throws IOException{
        PathBuilder path = new PathBuilder(this.getTypeStr(), this.getBrand());
        File file = new File(path.getPath());

        Scanner scan = new Scanner(path.getPath());

        while(scan.next() != this.getCarID()){
            this.setDimension(scan.nextInt(), scan.nextInt(), scan.nextInt());
            this.setTransmission(scan.nextLine());
            this.setEngine(scan.nextLine());
            this.setHorsepower(scan.nextInt());
            this.setCap(scan.nextInt());
            this.setFuel(scan.next().charAt(0));

            this.size = scan.nextInt();
            this.style = scan.nextInt();
        }

    }
    //saves remainder of the info
    public void save(File file) throws IOException{    
        FileWriter f = new FileWriter(file, true);  //append mode
        f.write(this.getSize() + "\n");
        f.write(this.getStyle() + "\n");
    }

    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setStyle(int style){
        this.style = style;
    }
    public String getSizeStr(){ //return size as string
        switch(size){
            case 1:
                return "City Car";
            case 2:
                return "Subcompact";
            case 3:
                return "Compact";
            case 4:
                return "Mid-size";
            case 5:
                return "Full Size";
            default:
                return "null";
        }
    }
    public int getStyle(){
        return style;
    }
    public String getStyleStr(){
        switch(style){
            case 0:
                return "Default";
            case 1:
                return "Three-door";
            case 2:
                return "Coupe";
            case 3:
                return "Convertible";
            default:
                return "null";

        }
    }


}