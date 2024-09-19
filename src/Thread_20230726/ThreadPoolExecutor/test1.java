package Thread_20230726.ThreadPoolExecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class test1 {

    static class MyTask implements  Runnable{
        private final String name;
        private final long duration;

        public MyTask(String name, long duration) {
            this.name = name;
            this.duration = duration;
        }

        public MyTask(String name) {
            this(name,0);
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"6666");
            try {
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public String toString() {
            return "MyTask{" +
                    "name='" + name + '\'' +
                    ", duration=" + duration +
                    '}';
        }
    }
    public static void main(String[] args) {
        /**
         * abortPolicy 默认策略    队列满了且没线程执行任务直接爆异常
         * callerRunsPolicy     调用者线程来执行该任务
         * discardOrdestPolicy  抛弃队列中最早的任务    把当前任务加入到工作队列当中
         * discardPolicy  直接把任务放弃
         */
        AtomicInteger c = new AtomicInteger(1);
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(2);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,
                3,
                10,
                TimeUnit.SECONDS,
                queue,//工作队列
                r->new Thread(r,"myThread"+c.getAndIncrement()),//线程工场也可以是Executors.defaultThreadFactory()
                new ThreadPoolExecutor.DiscardPolicy());
        Future<?> quan1 = threadPoolExecutor.submit(new MyTask("quan1", 300000000));



        try
        {
            Object o = quan1.get();
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        catch (ExecutionException e)
        {
            throw new RuntimeException(e);
        }
        threadPoolExecutor.submit(new MyTask("quan2",300000000));
       threadPoolExecutor.submit(new MyTask("quan3",0));
    }

}
