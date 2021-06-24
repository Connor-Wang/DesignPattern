package producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Connor
 * @create 2021-06-24-14:39
 */
public class Main {
    public static void main(String[] args){

        BlockingQueue<Integer> queue = new ArrayBlockingQueue(10);

        Thread producer1 = new Thread(new Producer(queue));
        producer1.start();

        Thread consumer1 = new Thread(new Consumer(queue));
        Thread consumer2 = new Thread(new Consumer(queue));
        Thread consumer3 = new Thread(new Consumer(queue));
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
