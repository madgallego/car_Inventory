package oop.car;
import java.io.*;
import java.util.*;
import oop.utils.PathBuilder;
public class EV extends Car{
    private int range;  //mileage before out of battery
    private char connector; //a for type 1, b for type 2, c for wireless
    private int batteryLife;    //battery life before it needs to be swapped/replaced
    public static int count = 0;

    public EV(String ID){
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

            this.range = scan.nextInt();
            this.connector = scan.nextLine().charAt(0);
            this.batteryLife = scan.nextInt();
        }

    }
    //saves remainder of the info
    public void save(File file) throws IOException{    
        FileWriter f = new FileWriter(file, true);  //append mode
        f.write(this.getRange() + "\n");
        f.write(this.getConnector() + "\n");
        f.write(this.getBatteryLife() + "\n");
    }
    public int getRange(){
        return range;
    }
    public void setRange(int range){
        this.range = range;
    }
    public void setConnector(char connector){
        this.connector = connector;
    }
    public void setBatteryLife(int batteryLife){
        this.batteryLife = batteryLife;
    }
    public int getRangeKMS(){
        return (int) ((float) range * 1.6);
    }
    public char getConnector(){
        return connector;
    }
    public String getConnectorStr(){
        switch(connector){
            case 'a':
                return "Type 1";
            case 'b':
                return "Type 2";
            case 'c':
                return "Wireless/Electric Road";
            default:
                return "null";

        }
    }
    public int getBatteryLife(){
        return batteryLife;
    }
    public int getBatteryLifeKMS(){
        return (int) (((float) batteryLife )* 1.6);
    }
}