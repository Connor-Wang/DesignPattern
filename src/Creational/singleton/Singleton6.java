/**
 * 内部类实现
 */
package Creational.singleton;

public class Singleton6 {

    private Singleton6(){}

    public static class InstanceHolder{
        private static final Singleton6 instance = new Singleton6();
    }

    public static Singleton6 getInstance(){
        return InstanceHolder.instance;
    }

}
