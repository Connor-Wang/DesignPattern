package factorypattern;

public abstract class Car {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 汽车启动的接口
     */
    void run(){};
}
