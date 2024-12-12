package oop.utils;

public class PathBuilder {
		private static String path = "oop\\database\\"; 
		String carType;
		String carBrand;
		
	public PathBuilder(String carType, String carBrand) {
		this.carType=carType;
		this.carBrand=carBrand;
		setPath();
	}
	
	private void setPath (){
		path = path+carType+"\\"+ carBrand +".txt";
	}
	
	public String getPath() {
		return path;
	}
	
}