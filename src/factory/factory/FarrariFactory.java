package factory.factory;

import factory.Car;
import factory.Farrari;

public class FarrariFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Farrari();
    }
}
