package Thread_20230726.callable_runnable_02.Api.join;

public class Test
{
	public static void main(String[] args) throws InterruptedException
	{

		/**
		 * 即join()的作用是：“等待该线程终止”，这里需要理解的就是该线程是指的主线程等待子线程的终止。
		 * 也就是在子线程调用了join()方法后面的代码，只有等到子线程结束了才能执行。
		 */
		Thread thread = new Thread(new RunnableTest());//打印 6
		Thread thread1 = new Thread(new RunnableTestb());//打印 7
		/**
		 * thread1.start(); 打印属性  7 6  主程序打印
		 * thread.start();
		 * thread.join
		 */
		thread.start(); //哪怕thread里面写了时间睡眠5秒    thread1里面不睡眠  但是只要thread1.start()方法写在thread.join后
		//那么 thread先执行  哪怕thread堵塞 那么就一直堵塞 后面的线程也不能执行
		thread.join();
		for(int i=0;i<10;i++){
			System.out.println("全福平好帅");//写在join方法后 后执行
		}
		thread1.start();


	}
}
