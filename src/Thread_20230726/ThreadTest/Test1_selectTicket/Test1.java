package Thread_20230726.ThreadTest.Test1_selectTicket;

public class Test1
{
	public static void main(String[] args)
	{
		ThreadCinema tc1 = new ThreadCinema("买票窗口1");
		ThreadCinema tc2 = new ThreadCinema("买票窗口2");
		tc1.start();
		tc2.start();

	}
}
