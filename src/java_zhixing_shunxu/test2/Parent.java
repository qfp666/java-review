package java_zhixing_shunxu.test2;

public class Parent
{
	static{
		System.out.println("父类静态代码块");
	}

	{
		System.out.println("父类普通代码块");
	}
	public Parent(){
		System.out.println("父类构造方法");
	}


}
