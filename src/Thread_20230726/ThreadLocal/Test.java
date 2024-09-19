package Thread_20230726.ThreadLocal;

public class Test extends  Thread
{
	public static void main(String[] args)
	{
		/**
		 * 每个线程都有个ThreadLocalMap
		 * key为ThreadLocal   每个线程可以用同一个 ThreadLocalkey
		 */
	    new Thread(new Test(){
			@Override
			public void run()
			{
				for(int i=0;i<5;i++){
					ThreadLocal<Object> objectThreadLocal = new ThreadLocal<>();
					System.out.println(objectThreadLocal);
				}
			}
		}).start();

	}
}
