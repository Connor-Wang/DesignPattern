package proxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        //Singer singer = new MaleSinger();
        //Agent agent = new Agent(singer);
        //agent.sing();

        Singer maleSinger = new MaleSinger();

        Singer singer = (Singer) Proxy.newProxyInstance(Main.class.getClassLoader(),
                new Class[]{Singer.class}, new DynamicAgent(maleSinger));

        singer.sing();


    }
}
