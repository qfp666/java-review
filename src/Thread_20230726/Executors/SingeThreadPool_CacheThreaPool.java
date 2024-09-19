package Thread_20230726.Executors;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import java.util.Date;
import java.util.concurrent.*;
import java.util.function.Function;

import static javafx.scene.input.KeyCode.T;

public class SingeThreadPool_CacheThreaPool
{
	public static void main(String[] args)
	{
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		//底层用的也是LinkedBlockingQueue 该队列的大小为Integer.MAX_VALUE
		//可能会造成OOM


		// ArrayBlockingQueue 队列大小也为Integer.MAX_VALUE

		/**
		 * CacheThreadPool没有核心线程,非核心线程无上限,但是工作线程(临时线程)存活时间只有60s
		 * 底层采用 SynchronousQueue队列
		 * 底层用的队列是    Synchronous(同步)QueueTest
		 *  队列不存储数据，所以没有大小，也无法迭代；
		 *因此当提交任务的速度大于处理任务的速度时，每次提交一个任务，就会创建一个线程。
		 * 极端情况下会创建过多的线程，耗尽 CPU 和内存资源。
		 *
		 *  */

		ExecutorService executorService1 = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++)
		{
            //如果不执行睡眠 有10个任务就一次性创建10个线程来完成任务
			//CacheThreadPool根据线程的数量来执行任务
			executorService1.submit(new Runnable()
			{
				@Override
				public void run()
				{
					System.out.println(Thread.currentThread().getName());
				}
			});

		}

		/**
		 * 底层DelayedWorkQueue()implements BlockingQueue<Runnable>
		 */
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(5);
		//延迟5秒后这5个任务被5个线程瞬间完成
		//也可以给每个任务安排不同的延迟时间
		for (int i=0;i<5;i++){
			ses.schedule(new Runnable()
			{
				@Override
				public void run()
				{
					System.out.println(Thread.currentThread().getName());
				}
			},5, TimeUnit.SECONDS);
		}
		//底层用的是DelayedWorkQueue是一个优先级队列,它可以保证每次出队的任务都是当前队列中执行时间最靠前的

		ExecutorService NWSP = Executors.newWorkStealingPool();
		//工作窃取 使用多个队列(FIFO(先进先出),LIFO(先进后出))来减少竞争
	}
}
