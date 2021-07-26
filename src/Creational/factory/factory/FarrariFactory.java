package Creational.factory.factory;

import Creational.factory.Car;
import Creational.factory.Farrari;

public class FarrariFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Farrari();
    }
}
