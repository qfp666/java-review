package Thread_20230726.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Test
{
	public static void main(String[] args)
	{
		/**
		 * 最大线程数和核心线程数一样
		 * 用的是   LinkedBlockingQueue() 无阻塞队列   最大长度是Integer.MAX_VALUE
		 * 容易OOM  堆内存溢出
		 */
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

		/**
		 * 核心线程数 参考服务器线程数
		 * 线程工厂  只有这两个参数
		 * 当自己队列任务处理完后 会到其他线程池队列拿任务来执行
		 */
		ExecutorService workThreadPool = Executors.newWorkStealingPool();

		/**
		 * 最大线程数和核心线程数都是1   且是无边界队列
		 * 容易OOM
		 */
		ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();

		/**
		 * 核心线程数为0    最大线程数是Integer.MAX_VALUE
		 * 线程存货时间 为60秒作为一个缓存
		 * 如果60秒内当前线程能处理完任务就用当前线程来执行
		 * 否则就创建一个新线程
		 * 适合短期内有大量短任务的场景
		 * 如果任务过长 容易存在线程过多 造成OOM
		 *
		 */
		ExecutorService executorService = Executors.newCachedThreadPool();

		/**
		 * 通过DelayWorkQueue()实现延迟任务
		 */
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

		/**
		 * 同时创建5个线程      5秒后 每个线程执行5次   一共打印25次66666e
		 */
		for(int i=0;i<5;i++){
			scheduledExecutorService.schedule(()->{
				for(int j=0;j<5;j++){
					System.out.println("66666");
				}
			}, 5,TimeUnit.SECONDS);

		}
		new ReentrantLock();

	}
}
