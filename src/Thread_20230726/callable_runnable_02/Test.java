package Thread_20230726.callable_runnable_02;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test  extends  Thread
{


	public static void main(String[] args) throws ExecutionException, InterruptedException
	{


		/***
		 * Runnable 的使用
		 */
		RunnableTest runnableTest = new RunnableTest();
		Thread thread1 = new Thread(runnableTest,"Runnable的使用");
		thread1.start();

		/**
		 * Callable的使用
		 * Callable表示多线程执行的任务
		 * FuturTask管理多线程执行的返回值
		 */
		CallableTest callableTest = new CallableTest();
		FutureTask<Integer> task = new FutureTask<Integer>(callableTest);
		Thread thread2 = new Thread(task, "Callable的使用");
		//得先启动线程 才能拿到值
		thread2.start();
		Integer integer = task.get();
		System.out.println("Callable的返回值是:"+integer);
	}
}
