package Inner_class_20230726;


/**
 * 静态内部类
 */
public class static_inner
{
	/**
	 *  静态内部类和成员内部类类似，
	 *  只是多了一个 static 关键字。
	 */
	static int age;
	double money;

	public void print(){
		new Wangxxiaosi();
	}

	/**
	 * 由于 static 关键字的存在，
	 * 静态内部类是不允许访问外部类中非 static 的变量和方法的
	 * 这一点也非常好理解：你一个静态的内部类访问我非静态的成员变量干嘛？
	 */
	static class Wangxxiaosi {
		private int number = 123;
		private static int name =1;
		public Wangxxiaosi (){
			System.out.println(age);
		}
	}

	public static void main(String[] args)
	{
		new static_inner().print();
	}
}
