/*
 * 懒汉式 + 锁
 */
package Creational.singleton;

public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){}
    public synchronized Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
