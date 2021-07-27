/**
 * 枚举类
 */
package creational.singleton;

public class Singleton7 {

    private Singleton7(){}

    private enum SingletonEnum{
        INSTANCE;

        private Singleton7 instance;

        SingletonEnum(){
            instance = new Singleton7();
        }

        public Singleton7 getInstance(){
            return instance;
        }
    }

    public static Singleton7 getInstance(){
        return SingletonEnum.INSTANCE.getInstance();
    }
}