package factorypattern;

import factorypattern.factory.CarFactory;
import factorypattern.factory.FarrariFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new FarrariFactory();
        Car car = carFactory.createCar();
        car.run();
    }
}
