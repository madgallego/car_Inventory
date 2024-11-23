package oop.car;

public class Car{
	private String carID;
	private double x; //dimension of the car
	private double y;
	private double weight;
	private String brand;
	private String model;
	private int type;
	private double price;
	private int capacity;	//number of persons it can contain
	private int num;
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
	public double getWeight(){
		return weight;
	}
	public String getBrand(){
		return brand;
	}
	public String getModel(){
		return model;
	}
	public int getType(){
		return type;
	}
	public int getNum(){
		return num;
	}
	public int getCap(){
		return capacity;
	}
}