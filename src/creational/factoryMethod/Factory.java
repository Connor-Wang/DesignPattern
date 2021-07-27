package creational.factoryMethod;

public abstract class Factory {

    abstract public Product createProduct();

    public void doSomething() {
        Product product = createProduct();
        // do something with the product
    }

}
