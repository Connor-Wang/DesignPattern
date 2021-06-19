package factorypattern.factory;

import factorypattern.Car;
import factorypattern.Farrari;
import factorypattern.factory.CarFactory;

public class FarrariFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Farrari();
    }
}
