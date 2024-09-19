package Thread_20230726.ES;

import java.util.concurrent.CountDownLatch;

/**
 * 测试
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        //创建一个倒计时锁  底层使用的是AQS
        CountDownLatch countDownLatch = new CountDownLatch(3);


       new Thread(()->{
           System.out.println(Thread.currentThread().getName()+"-begin...");
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           //count--
           countDownLatch.countDown();
           System.out.println(Thread.currentThread().getName()+"-end..."+ countDownLatch.getCount());
       }).start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"-begin...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //count--
            countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName()+"-end..."+ countDownLatch.getCount());
        }).start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"-begin...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //count--
            countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName()+"-end..."+ countDownLatch.getCount());
        }).start();
        String name = Thread.currentThread().getName();
        System.out.println(name+"-waiting");
        //等待其他线程锁完成  await()的方法等待倒计时锁的计数为0
        countDownLatch.await();
        System.out.println(name+"-wait end...");
    }
}
