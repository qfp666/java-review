package Thread_20230726.callable_runnable_02.Api;

public class ThreadTest extends Thread
{
	/**
	 * 两线程同时加5次
	 */
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++){

				System.out.println(getName()+i);


		}
	}
}
