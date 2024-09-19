package Thread_20230726.Threadblocking;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    ArrayBlockingQueue<String> queue;
    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;

    }
    @Override
    public void run() {
        while(true){
            //从阻塞队列拿面条
            try{
                String food = queue.take();//底层实现了锁对象 锁还有await和notify方法
                System.out.println("面条好好吃");
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }

}
