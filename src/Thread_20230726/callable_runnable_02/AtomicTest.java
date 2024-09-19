package Thread_20230726.callable_runnable_02;

import Thread_20230726.callable_runnable_02.Api.Test;

public class AtomicTest
{
	public static     int a=0;
	public static void main(String[] args) throws InterruptedException
	{
		Thread[] threads = new Thread[10];
	  for(int i=0;i<10;i++){
		  threads [i]  =  new Thread(new Runnable(){
			  @Override
			  public void run()
			  {
				  for(int j=0;j<1000;j++){
					  try{
						  synchronized (Object.class){
							  a++;
						  }
					  }catch (Exception e){
						  e.printStackTrace();
					  }
				  }

			  }
		  });
		  threads[i].start();
	  }
		for (Thread thread : threads) {
			thread.join(); // 等待所有线程执行完毕
		}
		System.out.println(a);//不加volatile得到的值 大概是<=10000
		 //加了volatile也不一定是10000  还要通过加锁确保原子操作才能是10000
		//或者只加锁也有可能是10000 不用volatile也可以是10000

	}
}
