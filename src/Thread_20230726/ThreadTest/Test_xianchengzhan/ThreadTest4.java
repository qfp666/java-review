package Thread_20230726.ThreadTest.Test_xianchengzhan;

import java.util.ArrayList;

public class ThreadTest4 extends Thread
{
	@Override
	public void run()
	{
		ArrayList<Object> objects = new ArrayList<>();//线程私有的链表
		super.run();
	}
}
