package Thread_20230726.ThreadTest.Test1_selectTicket;

public class ThreadCinema extends  Thread
{
	public static Integer count = 1000;
	private String name;
	public static Object lock = new Object(); //采用继承Thread类 因此 创建了多个Thread对象 为了保证锁对象唯一 要采用static进行修饰

	public ThreadCinema(String name)
	{
		 this.name = name;
	}

	@Override
	public void run()
	{
		while(count>0){
			synchronized (lock)
			{

				try
				{
					System.out.println(getName() + "卖票还剩下" + count + "张票");
					count--;
					Thread.sleep(3000);
				}
				catch (InterruptedException e)
				{
					throw new RuntimeException(e);
				}
			}
		}
	}
}
