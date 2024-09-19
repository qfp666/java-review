package Thread_20230726.ThreadTest.Test2_sendShop;

public class ThreadShop implements  Runnable
{
	public static int  count = 100;
	public Object o = new Object();

	@Override
	public void run()
	{
		while(count>=10){
			synchronized (o){
				System.out.println(Thread.currentThread().getName()+"送出礼物,还剩下"+count+"份礼物");
				count--;
			}
		}
	}
}
