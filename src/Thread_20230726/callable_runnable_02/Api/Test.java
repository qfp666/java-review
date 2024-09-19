package Thread_20230726.callable_runnable_02.Api;

public class Test
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadTest threadTest = new ThreadTest();
		ThreadTest threadTest1 = new ThreadTest();
		threadTest.setName("quan");
		threadTest.start();
		threadTest1.start();
		/**
		 * sleep()方法也要在run方法内使用
		 * getname()也是
		 * threadTest.setPriority();//执行完毕的概率稍微高一些
		 * threadTest1.setDaemon(true); 变成守护线程 先让线程threadTest执行完毕 如果线程执行完毕那么守护线程也没必要执行了
		 * threadTest1.yield();//礼让线程    在run方法中写 让cpu的权限
		 * threadTest.join(); 让当前线程先执行 main线程后执行
		 */
	}
}
