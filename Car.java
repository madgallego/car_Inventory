package oop.car;

public class Car{
	private String carID;
	private double x; //dimension of the car
	private double y;
	private double price;
	private static carTotal = 0;
	
	
	Car(String carID){
		this.carID = carID; //always needed so the car is within the dat base
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

	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
}