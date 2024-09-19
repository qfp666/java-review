package Inner_class_20230726.lambda;

import java.util.function.Function;

public class Test
{
	public static void main(String[] args)
	{
		/**
		 * 匿名内部类的方式 可以直接被创建然后调用
		 */
	Service s = 	new  Service(){
			@Override
			public void eat()
			{
				System.out.println("我爱吃反");
			}
		};
	  show(s);
		/**
		 * 也可以
		 */
		show(new Service()
		{
			@Override
			public void eat()
			{
				System.out.println("7777");
			}
		});

		/**
		 * lambda表达式方式 必须作为其他方法的参数
		 */
		show(()->{
		System.out.println("6666");
		});

	}

	public static void show(Service service){
		service.eat();
	}

}
