package Thread_20230726.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class TestInterrputLock
{
	public static ReentrantLock lock = new ReentrantLock();
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					lock.lockInterruptibly();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
					System.out.println("等待的过程被打断");
					return;
				}
				try
				{
					System.out.println(Thread.currentThread().getName() + "获得了锁");
				}
				finally
				{
					lock.unlock();
				}
			}
		});
		t1.start();
		lock.lock();//其他线程获取了锁
		System.out.println("主线程获得了锁");
		try{
			Thread.sleep(1000);
			t1.interrupt(); //main线程对该等待线程发出了中断请求，‌
			 // 那么等待线程将能够响应这个中断请求并退出等待状态。‌这种机制有助于避免线程无限制地等待下去，‌从而防止死锁的发生。‌
			System.out.println("执行打断");
		}
		catch (InterruptedException e)
		{
			throw new RuntimeException(e);
		}
		finally
		{
			lock.unlock();
		}
	}
}
