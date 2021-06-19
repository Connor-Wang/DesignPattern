package factorypattern.factory;

import factorypattern.Benz;
import factorypattern.Car;
import factorypattern.factory.CarFactory;

public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
