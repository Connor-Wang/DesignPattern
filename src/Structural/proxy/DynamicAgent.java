package Structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicAgent implements InvocationHandler {

    private Object object;

    public DynamicAgent(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("agent work 1");
        System.out.println("agent work 2");
        System.out.println("agent work 3");
        System.out.println("agent work 4");

        Object invoke = method.invoke(object,args);

        System.out.println("agent work 5");
        System.out.println("agent work 6");
        return invoke;
    }
}
