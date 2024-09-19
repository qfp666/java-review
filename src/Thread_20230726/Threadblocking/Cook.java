package Thread_20230726.Threadblocking;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends  Thread{
    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            //放面条到阻塞队列中
            try{
                queue.put("面条");//底层实现了锁对象 锁还有await和notify方法
                System.out.println("厨师放了一碗面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
