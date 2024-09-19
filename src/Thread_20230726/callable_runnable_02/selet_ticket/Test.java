package Thread_20230726.callable_runnable_02.selet_ticket;

import java.util.concurrent.locks.ReentrantLock;

public class Test
{
	static ReentrantLock lock = new ReentrantLock();
	public static void main(String[] args)
	{
		Ticket ticket = new Ticket(100);
		new Thread(new Runnable()
		{
			@Override
			public void  run()
			{
				lock.lock();
				while(ticket.n>0){
					System.out.println(Thread.currentThread().getName()+"现在是第"+ticket.n+"张票");
					ticket.n--;
					if(ticket.n==50){
						break;
					}
				}
				lock.unlock();

			}
		},"卖票员1").start();

		new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				lock.lock();
				while(ticket.n>0){
					System.out.println(Thread.currentThread().getName()+"现在是第"+ticket.n+"张票");
					ticket.n--;
				}
				lock.unlock();

			}
		},"卖票员2").start();


	}


}
