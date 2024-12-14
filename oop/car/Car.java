package oop.car;

import java.util.ArrayList;
public class Car{
	public ArrayList<String> attribs;
	public static int attribCount = 11;
	private String carID;
	private double x; //dimension of the car
	private double y;
	private double z;
	private String transmission;
	private String brand;
	private String model;
	private String engine;
	private int horsepower;
	private String type;
	private double price;
	private int capacity;	//number of persons it can contain
	private static int num;
	private String fuel; //a gas, b diesel, c biodiesel, d cng, e ethanol, f electric
	
	
	public Car(ArrayList<String> attribs){
		this.attribs = attribs;
		this.carID = attribs.get(0); //always needed so the car is within the dat base
		this.type = carID.substring(3, 5);
		this.num = Integer.parseInt(carID.substring(8,10));
		this.price = Integer.parseInt((this.carID.substring(10, 14))) * Math.pow(10, Integer.parseInt(this.carID.substring(14,15)));

		setBrand(attribs.get(1));
		setModel(attribs.get(2));
		setDimension(Double.parseDouble(attribs.get(3)), Double.parseDouble(attribs.get(4)), Double.parseDouble(attribs.get(5)));
		setEngine(attribs.get(6));
		setHorsepower(Integer.parseInt(attribs.get(7)));
		setCap(Integer.parseInt(attribs.get(8)));
		setFuel(attribs.get(9));
		setType(attribs.get(10));
	}

	public String getCarID(){
		return carID;
	}
	//updates id based on any changes
	public void setID(){
		String temp = carID.substring(0,8);
		String pow;
		if(num < 10)
			pow = "0" + num;
		else
			pow = "" + num;
		temp += pow;
		temp += carID.substring(10,15);
		carID = temp;
	}
	public void update(){
		attribs.set(0, carID);
	}
	
	public void setDimension(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getCarX(){	//length
		return x;
	}
	public double getCarY(){ //height
		return y;
	}
	public double getCarZ(){ //width
		return z;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public String getTransmission(){
		return transmission;
	}
	public void setTransmission(String transmission){
		this.transmission = transmission;
	}
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	


	public int getNum(){
		return num;
	}
	public void setNum(int num){
		this.num = num;
	}
	public int getCap(){
		return capacity;
	}
	public void setCap(int capacity){
		this.capacity = capacity;
	}
	public String getEngine(){
		return engine;
	}
	public void setEngine(String engine){
		this.engine = engine;
	}
	public int getHorsepower(){
		return horsepower;
	}
	public void setHorsepower(int horsepower){
		this.horsepower = horsepower;
	}
	 public String getFuel(){
        return fuel;
    }
	public void setFuel(String fuel){
		this.fuel = fuel;
	}
    


}