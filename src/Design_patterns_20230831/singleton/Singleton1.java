package Design_patterns_20230831.singleton;

/**
 * 恶汉式      浪费内存空间 类加载的时候单例就创建了
 */
public class Singleton1
{
	 public static final  Singleton1 singleTon = new Singleton1();

	 public  Singleton1(){

	 }

	 public static Singleton1 getInstance(){
		 return singleTon;
	 }
}
