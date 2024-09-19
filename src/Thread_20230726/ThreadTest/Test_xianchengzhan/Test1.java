package Thread_20230726.ThreadTest.Test_xianchengzhan;

public class Test1
{
	public static void main(String[] args)
	{
		ThreadTest4 tt1 = new ThreadTest4();
		ThreadTest4 tt2 = new ThreadTest4();
		tt1.setName("线程一");
		tt2.setName("线程二");
		tt1.start();//运行程序首写栈帧会运行main线程   当调用start方法才会开启线程栈
		tt2.start();
	}
}
