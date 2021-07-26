package Creational.factory;

import Creational.factory.factory.CarFactory;
import Creational.factory.factory.FarrariFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new FarrariFactory();
        Car car = carFactory.createCar();
        car.run();
    }
}
