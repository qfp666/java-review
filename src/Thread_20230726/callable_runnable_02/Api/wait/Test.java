package Thread_20230726.callable_runnable_02.Api.wait;

public class Test
{
	public static void main(String[] args) throws InterruptedException
	{

		Thread thread = new Thread(new ThreadTest());
		Thread thread1 = new Thread(new ThreadTest());
		thread.start();
		thread1.start();

	}
}
