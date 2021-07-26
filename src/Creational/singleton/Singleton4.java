/*
 * 懒汉式 + double check，存在问题，
 * 第一个线程在创建对象的时候，发生指令重排序，导致第二个线程判断 instance == null 为 false，但是 instance 并没有初始化完成。
 */
package Creational.singleton;

public class Singleton4 {
    private static Singleton4 instance;
    private Singleton4(){}
    public Singleton4 getInstance(){
        if(instance == null){
            synchronized (Singleton4.class) {
                if(instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
