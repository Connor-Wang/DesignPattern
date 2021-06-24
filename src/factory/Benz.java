package factory;

public class Benz extends Car{

    @Override
    void run() {
        System.out.println(this.getColor()+" Benz running!");
    }
}
