package factory;

public class BMW extends Car{

    @Override
    public void run() {
        System.out.println(this.getColor()+" BWM running!");
    }
}
