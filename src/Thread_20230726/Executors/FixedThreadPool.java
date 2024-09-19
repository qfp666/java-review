package Thread_20230726.Executors;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class FixedThreadPool
{
	public static void main(String[] args) throws ExecutionException, InterruptedException
	{
		// 创建一个包含5个线程的线程池
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		//采用的是  new LinkedBlockingQueue<Runnable>() 队列
		//队列的大小是Integer.MAX_VALUE 可能会造成oom
		ReentrantLock reentrantLock = new ReentrantLock();


		// 创建一个Callable任务
		Callable<String> task = new Callable<String>() {
			public  String call() {
			/*	Thread_20230726.reentrantLock.lock();
				Thread_20230726.reentrantLock.unlock();*/
				return "Hello from " + Thread.currentThread().getName();

			}
		};
		Thread t1 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{

			}
		},"5555");
        //executorService.execute(t1);


		//创建一个Runnable任务
		Runnable a= new Runnable(){
			@Override
			public void run()
			{
				System.out.println("全福平66666666");
			}
		};

		// 提交任务到ExecutorService执行，并获取Future对象
		Future[] futures = new Future[10];
		for (int i = 0; i < 5; i++) {
			//线程池的submit方法参数为Callable  会有返回值 也可以以是Runable
			futures[i] = executorService.submit(task);
			//线程吃的execute方法参数为Runnable 没有返回值
			executorService.execute(a);
		}

		// 通过Future对象获取任务的结果
		for (int i = 0; i < 5; i++) {
			System.out.println(futures[i].get());
		}

		// 关闭ExecutorService，不再接受新的任务，等待所有已提交的任务完成
		executorService.shutdown();
	}

}
