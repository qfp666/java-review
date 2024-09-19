package Thread_20230726.Threadblocking;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingThread {
    public static void main(String[] args) {
        //1.创建阻塞队列 的对象  大小为1
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        //还有new LinkedBlockingDeque<>()
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);
       f.start();
       c.start();
    }
}
