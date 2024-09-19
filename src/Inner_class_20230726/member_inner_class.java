package Inner_class_20230726;

import java.util.Comparator;

/**
 * 成员内部类     用的较少
 */
public class member_inner_class
{
	String sex  = "男";
	private String name = "全福平";
	static double money = 1;
	/*外部类想要访问内部类的成员，就不那么容易了，
	必须先创建一个成员内部类的对象，再通过这个对象来访问：*/
	public member_inner_class(){
          new wangxiaoer().print();
	}
	class wangxiaoer{
		int age = 81;
		public  void print(){
			/*看起来内部类 Wangxiaoer 就好像 Wanger 的一个成员，
			成员内部类可以无限制访问外部类的所有成员属性。*/
			System.out.println(age);
			System.out.println(name);
		}

	}

	public static void main(String[] args)
	{
		/*在静态方法中访问成员内部类的时候，
		就必须先得创建一个外部类的对象
	   ，因为内部类是依附于外部类的。*/
		member_inner_class member_inner_class = new member_inner_class();
		wangxiaoer wangxiaoer = member_inner_class.new wangxiaoer();
		wangxiaoer.print();


	}



}
