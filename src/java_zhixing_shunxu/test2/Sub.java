package java_zhixing_shunxu.test2;

public class Sub extends Parent
{

	static{
		System.out.println("子类静态代码块");
	}
	{
		System.out.println("子类普通代码块");
	}
	public Sub(){
		System.out.println("子类构造方法");
	}

	public static void main(String[] args)
	{
		System.out.println("6666");
		Parent p = new Sub();
	}


	/**
	 *
	 * 执行顺序
	 * 父类静态代码块
	 * 子类静态代码块
	 * 6666
	 * 父类普通代码块
	 * 父类构造方法
	 * 子类普通代码块
	 * 子类构造方法
	 */

	/**
	 * 如果main方法放在父类当中执行顺序如下
	 * 父类静态代码块
	 * 6666
	 * 子类静态代码块
	 * 父类普通代码块
	 * 父类构造方法
	 * 子类普通代码块
	 * 子类构造方法
	 */


}
