package creational.factoryMethod;

public class ConcreteFactory2 extends Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
