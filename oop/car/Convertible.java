package oop.car;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import oop.utils.PathBuilder;
public class Convertible extends Car{
    private int roofType;   //0 for textile, 1 for detachable hardtop, 2 for retractable hardtop
    private static int count = 0;
    public Convertible(String ID){
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

            this.roofType = scan.nextInt();
        }

    }
    //saves remainder of the info
    public void save(File file) throws IOException{    
        FileWriter f = new FileWriter(file, true);  //append mode
        f.write(this.getRoofType());
    }
    public int getRoofType(){
        return roofType;
    }
    public void setRoofType(int roofType){
        this.roofType = roofType;
    }
}