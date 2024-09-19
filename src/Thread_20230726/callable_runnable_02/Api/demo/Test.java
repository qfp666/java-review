package Thread_20230726.callable_runnable_02.Api.demo;

public class Test
{
	public static void main(String[] args)
	{

		/**
		 * 守护线程  当 JVM 中不存在任何一个正在运行的非守护线程时，则 JVM 进程即会退出。
		 */
		Thread thread = new Thread(new RunnableTest());
		thread.setDaemon(true);//不设置守护线程 主线程执行完毕后任然执行
		thread.start(); //设置守护线程   主线程执行完毕后守护线程就不执行了
		System.out.println(10);


	}
}
