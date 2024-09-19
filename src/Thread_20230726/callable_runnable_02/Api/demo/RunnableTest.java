package Thread_20230726.callable_runnable_02.Api.demo;

public class RunnableTest implements  Runnable
{
	@Override
	public void run()
	{

		try
		{
			for (int i = 0; i < 5; i++)
			{
				System.out.println(Thread.currentThread().getName()+i);
				Thread.sleep(1000);

			}
		}
		catch (InterruptedException e)
		{
			throw new RuntimeException(e);
		}
	}
}
