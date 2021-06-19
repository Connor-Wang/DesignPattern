package factorypattern.factory;

import factorypattern.Car;

public interface CarFactory {

    /**
     * 汽车工厂接口
     * @return
     */
    Car createCar();
}
