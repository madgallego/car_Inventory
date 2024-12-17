package oop.utils;

import java.util.*;
import oop.car.*;

public class Test {
    public static void main(String[] args) {
        int carType=0;
        String carBrand="BMW";
        switch (carType) {
            case 0:
                ArrayList<Convertible> ListInfo0 = CarLoader.loadConvertible(carBrand);

                    System.out.println(ListInfo0.get(0).attribs.get(i));
                break;
            case 1:
                ArrayList<Coupe> ListInfo1 = CarLoader.loadCoupe(carBrand);
                break;
            case 2:
                ArrayList<Crossover> ListInfo2 = CarLoader.loadCrossover(carBrand);
                break;
            case 3:
                ArrayList<EV> ListInfo3 = CarLoader.loadEV(carBrand);
                break;
            case 4:
                ArrayList<Hatchback> ListInfo4 = CarLoader.loadHatchback(carBrand);
                break;
            case 5:
                ArrayList<Luxury> ListInfo5 = CarLoader.loadLuxury(carBrand);
                break;
            case 6:
                ArrayList<Minivan> ListInfo6 = CarLoader.loadMinivan(carBrand);
                break;
            case 7:
                ArrayList<Truck> ListInfo7 = CarLoader.loadTruck(carBrand);
                break;
            case 8:
                ArrayList<Sedan> ListInfo8 = CarLoader.loadSedan(carBrand);
                break;
            case 9:
                ArrayList<SportsCar> ListInfo9 = CarLoader.loadSportsCar(carBrand);
                break;
            case 10:
                ArrayList<Wagon> ListInfo10 = CarLoader.loadWagon(carBrand);
                break;
            case 11:
                ArrayList<SUV> ListInfo11 = CarLoader.loadSUV(carBrand);
                break;
            default:
                throw new AssertionError();
        }
        
    }

}