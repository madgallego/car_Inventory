package oop.car;

public class Car{
	private int carID;
	private double x; //dimension of the car
	private double y;
	private double price;
	
	Car(int carID){
		this.carID = carID; //always needed so the car is within the dat base
	}

	public int getCarID(){
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