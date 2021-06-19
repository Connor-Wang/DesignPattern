package factorypattern.factory;

import factorypattern.BMW;
import factorypattern.Car;
import factorypattern.factory.CarFactory;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }
}
