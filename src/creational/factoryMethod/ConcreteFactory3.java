package creational.factoryMethod;

public class ConcreteFactory3 extends Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProduct3();
    }
}
