/*
 * 懒汉式 + double check + volatile
 */
package creational.singleton;

public class Singleton5 {
    private static volatile Singleton5 instance;
    private Singleton5(){}
    public Singleton5 getInstance(){
        if(instance == null){
            synchronized (Singleton5.class) {
                if(instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
