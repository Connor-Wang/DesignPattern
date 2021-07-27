package creational.factoryMethod;


public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory1();
        Product product = factory.createProduct();
    }
}
