package factory.factory;

import factory.BMW;
import factory.Car;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }
}
