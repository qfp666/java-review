package Thread_20230726.Thread_Exception;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryTest implements ThreadFactory
{
	@Override
	public Thread newThread(@NotNull Runnable r)
	{
		Thread thread = new Thread(r);
		thread.setUncaughtExceptionHandler((t,e)->{
			System.out.println("湖南工学院"+t.currentThread().getName()+"threw exception:"+e);
		});
		return thread;
	}

	public static void main(String[] args)
	{
		  ThreadFactoryTest tf = new ThreadFactoryTest();

		  tf.newThread(()->{
			  int i = 1/0;
			  System.out.println("6666666");
		  }).start();

		 tf.newThread(new Runnable(){
			 @Override
			 public void run()
			 {
				 int i=1/0;
				 System.out.println(77777);
			 }
		 }).start();

		 tf.newThread(new Thread(new Runnable()
		 {
			 @Override
			 public void run()
			 {
				 int i=1/0;
				 System.out.println(77777);
			 }
		 },"全福平")).start();



	}


}
