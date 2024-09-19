package java_zhixing_shunxu.test3;

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("6666");
		Parent p = new Sub();
	}
	//正常顺序 静态代码块>静态方法>普通代码块 >构造方法
	//如果有静态对象 那么静态对象的创建和静态代码块的执行顺序是谁在前谁就先执行

	/**
	 * 6666
	 * 父类普通代码块 创建父类静态对象
	 * 父类构造方法
	 * 父类静态代码块
	 *
	 * 父类普通代码块 创建子类静态对象
	 * 父类构造方法
	 * 子类普通代码块
	 * 子类构造方法
	 * 子类静态代码块
	 *
	 * 父类普通代码块 创建子类普通对象
	 * 父类构造方法
	 * 子类普通代码块
	 * 子类构造方法
	 */
}
