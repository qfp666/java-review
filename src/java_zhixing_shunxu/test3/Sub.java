package java_zhixing_shunxu.test3;

public class Sub extends Parent
{

	public static Sub s = new Sub();
	static{
		System.out.println("子类静态代码块");
	}
	{
		System.out.println("子类普通代码块");
	}
	public Sub(){
		System.out.println("子类构造方法");
	}
}
