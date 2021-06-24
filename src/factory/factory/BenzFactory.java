package factory.factory;

import factory.Benz;
import factory.Car;

public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
