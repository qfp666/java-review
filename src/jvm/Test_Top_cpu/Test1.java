package jvm.Test_Top_cpu;

import java.util.concurrent.locks.ReentrantLock;

public class Test1
{

	public static void main(String[] args)
	{
		ReentrantLock reentrantLock1 = new ReentrantLock();
		ReentrantLock reentrantLock2 = new ReentrantLock();

		new Thread(()->{
			try
			{
				reentrantLock1.lock();
				Thread.sleep(1000);
				reentrantLock2.lock();
				System.out.println("666666");
			}
			catch (InterruptedException e)
			{
				throw new RuntimeException(e);
			}finally
			{
				  reentrantLock1.unlock();
				  reentrantLock2.unlock();
			}
		}).start();

		new Thread(new Runnable(){
			@Override
			public void run()
			{try {
				reentrantLock2.lock();
				Thread.sleep(1000);
				reentrantLock1.lock();
				System.out.println("666666");
			}
			catch (InterruptedException e)
			{
				throw new RuntimeException(e);
			}finally
			{
				reentrantLock2.unlock();
				reentrantLock1.unlock();
			}

			}
		}).start();
	}
}
