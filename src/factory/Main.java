package factory;

import factory.factory.CarFactory;
import factory.factory.FarrariFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new FarrariFactory();
        Car car = carFactory.createCar();
        car.run();
    }
}
