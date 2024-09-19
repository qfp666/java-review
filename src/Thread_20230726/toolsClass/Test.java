package Thread_20230726.toolsClass;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class Test
{

	public static void main(String[] args)
	{


		ConcurrentHashMap<String, Integer> hashMap = new ConcurrentHashMap<>();
		hashMap.put("key1",1);
		Integer key2 = hashMap.computeIfAbsent("key2", k -> 2);//不存在则创建值
		System.out.println(hashMap.get("key2"));

		AtomicInteger atomicInteger = new AtomicInteger(0);
		atomicInteger.incrementAndGet();
		atomicInteger.decrementAndGet();
		atomicInteger.incrementAndGet();
		atomicInteger.compareAndSet(1,2);
		System.out.println(atomicInteger);//2


	}

	/**
	 * 控制一定的线程数量
	 */
	public  static void  addOne(){
		int count =0;
		Semaphore semaphore = new Semaphore(2);
		try{
			semaphore.acquire();//信号量减一  /一次接收两个线程进行操作
			count+=1;
		}catch (InterruptedException e){
			e.printStackTrace();
		}finally
		{
			semaphore.release();//信号两加1
		}
	}
}
