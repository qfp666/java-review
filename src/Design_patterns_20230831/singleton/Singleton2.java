package Design_patterns_20230831.singleton;

public class Singleton2
{
	private Singleton2(){

	}

	/**
	 * 静态内部类 实现了延迟加载
	 */
	public static class SingleTonHoder{
		private static Singleton2 instance = new Singleton2();
	}

	public static Singleton2 getInstance(){
		return SingleTonHoder.instance;
	}
}
