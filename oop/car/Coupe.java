package oop.car;

import java.io.*;
import java.util.*;
import oop.utils.PathBuilder;
public class Coupe extends Car{
    private boolean rear;   //if it has seats at the back
    private int doors;  //specifies door count, typically 2
    private String style;
    public static int count = 0;

    public Coupe(String ID){
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

            this.rear = scan.nextBoolean();
            this.doors = scan.nextInt();
            this.style = scan.nextLine();
        }

    }
    //saves remainder of the info
    public void save(File file) throws IOException{    
        FileWriter f = new FileWriter(file, true);  //append mode
        f.write(this.getRear() + "\n");
        f.write(this.getDoors() + "\n");
        f.write(this.getStyle() + "\n");
    }

    public boolean getRear(){
        return rear;
    }
    public void setRear(boolean rear){
        this.rear = rear;
    }
    public int getDoors(){
        return doors;
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public String getStyle(){
        return style;
    }
    public void setStyle(String style){
        this.style = style; 
    }
}