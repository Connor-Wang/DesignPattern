package Creational.factory.factory;

import Creational.factory.BMW;
import Creational.factory.Car;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }
}
