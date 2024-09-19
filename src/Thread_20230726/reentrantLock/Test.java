package Thread_20230726.reentrantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 条件
 */
public class Test
{
	static ReentrantLock lock = new ReentrantLock();

	static Condition c1 = lock.newCondition();

	static Condition c2 = lock.newCondition();


	public static void main(String[] args)
	{
		conditionTest();
		//lock.lockInterruptibly(); 开启可中断锁

	}

	public static void conditionTest()
	{
         new Thread(()->{
			 lock.lock();
			 try
			 {
				 c1.await();//让当线程等待并且释放锁
				 System.out.println(Thread.currentThread().getName()+"1.acquire lock");
				 Thread.sleep(1000);
			 }
			 catch (InterruptedException e)
			 {
				e.printStackTrace();
			 }finally
			 {
				 lock.unlock();
			 }
		 },"t1").start();

		new Thread(()->{
			lock.lock();
			try
			{
				c2.await();
				System.out.println(Thread.currentThread().getName()+"2.acquire lock");
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}finally
			{
				lock.unlock();
			}
		},"t2").start();

		new Thread(()->{
			lock.lock();
			try
			{
				c2.signal();
				c1.signal();
				System.out.println(Thread.currentThread().getName()+"3.acquire lock");
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}finally
			{
				lock.unlock();
			}
		},"t3").start();
	}
}
