/*
 * 恶汉式
 */
package creational.singleton;

public class Singleton1 {
    private static final Singleton1 instance = new Singleton1();
    private Singleton1() { }
    public static Singleton1 getInstance() {
        return instance;
    }
}
