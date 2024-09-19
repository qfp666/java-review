package Thread_20230726.ThreadTest.Test2_sendShop;

public class Test2
{
	public static void main(String[] args)
	{
		ThreadShop threadShop = new ThreadShop();
		new Thread(threadShop,"全福平").start();
		new Thread(threadShop,"全亦凡").start();
	}
}
