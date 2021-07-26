package Creational.factory.factory;

import Creational.factory.Benz;
import Creational.factory.Car;

public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
