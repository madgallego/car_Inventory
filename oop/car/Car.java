package oop.car;

public class Car{
	private String carID;
	private double x; //dimension of the car
	private double y;
	private double weight;
	private String brand;
	private String model;
	private String engine;
	private int horsepower;
	private int type;
	private double price;
	private int capacity;	//number of persons it can contain
	private int num;
	private char fuel; //a gas, b diesel, c biodiesel, d cng, e ethanol, f electric
	public static int carTotal = 0;
	
	
	public Car(String carID){
		this.carID = carID; //always needed so the car is within the dat base
		this.brand = carID.substring(0,3);
		this.type = Integer.parseInt(carID.substring(3, 5));
		this.model = carID.substring(5, 8);
		this.num = Integer.parseInt(carID.substring(8,10));
		this.price = Integer.parseInt((this.carID.substring(10, 14))) * Math.pow(10, Integer.parseInt(this.carID.substring(14,15))); 
		this.carTotal++;
	}

	public String getCarID(){
		return carID;
	}
	
	public void setDimension(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getCarX(){
		return x;
	}
	public double getCarY(){
		return y;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight = weight;
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
	public int getType(){
		return type;
	}
	public void setType(int type){
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
	 public char getFuel(){
        return fuel;
    }
	public void setFuel(char fuel){
		this.fuel = fuel;
	}
    public String getFueltr(){
        switch(fuel){
            case 'a':
                return "Gasoline";
            case 'b':
                return "Diesel";
            case 'c':
                return "Biodiesel";
            case 'd':
                return "CNG";
			case 'e':
				return "Ethanol";
			case 'f':
				return "Battery-Electric";

            default:
                return "null";
        }
    }
}