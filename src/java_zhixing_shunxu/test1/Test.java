package java_zhixing_shunxu.test1;

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("6666");
		Parent p = new Sub();
	}

	/**
	 * 运行结果
	 * 6666
	 * 父类静态代码块
	 * 子类静态代码块
	 * 父类普通代码块
	 * 父类构造方法
	 * 子类普通代码块
	 * 子类构造方法
	 */
}
