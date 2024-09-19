package java_zhixing_shunxu.test3;

public class Parent
{

	public static Parent  a = new Parent(); //在前面  就比静态代码块先执行
	static{
		System.out.println("父类静态代码块");
	}

	public Parent(){
		System.out.println("父类构造方法");
	}

	{
		System.out.println("父类普通代码块");
	}
}
