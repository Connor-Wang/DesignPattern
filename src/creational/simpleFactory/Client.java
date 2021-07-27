package creational.simpleFactory;

public class Client {

    public static void main(String[] args) {
        int type = 1;
        Product product;

        /*if(type == 1){
            product = new ConcreteProduct1();
        } else if (type == 2){
            product = new ConcreteProduct2();
        } else if (type == 3){
            product = new ConcreteProduct3();
        }*/

        /*Better*/
        SimpleFactory simpleFactory = new SimpleFactory();
        product = simpleFactory.createProduct(type);
    }

}
