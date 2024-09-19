package Thread_20230726.sychronized;

public class Test
{
	public static void main(String[] args)
	{
		new Thread(()->{
			synchronized (Object.class){
				System.out.println("66666");
			}
		});
	}
}
