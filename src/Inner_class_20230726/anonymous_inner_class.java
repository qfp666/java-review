package Inner_class_20230726;

/**
 * 匿名内部类
 */
public class anonymous_inner_class
{

	public static void main(String[] args)
	{

		/**
		 * 匿名内部类像个参数一样我们自己生成
		 * 有一下两种调用方式
		 */
		Thread thread1 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<10;i++){
					System.out.println("全福平真的帅");
				}
			}
		});
		thread1.start();


		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<10;i++){
					System.out.println("真的帅？");
				}

			}
		}).start();
	}
}
