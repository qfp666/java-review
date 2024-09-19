package Thread_20230726.callable_runnable_02.Api.join;

public class RunnableTest implements  Runnable
{
	@Override
	public void run()
	{
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			throw new RuntimeException(e);
		}
		System.out.println("6");
	}
}
