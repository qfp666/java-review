package Inner_class_20230726.lambda.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class supplierTest
{
	public static void main(String[] args)
	{
		/**
		 * 1.想获取一个新对象使用Supplier<T>
		 * 函数时接口Supplier<T>   Supplier没有入参，会返回一个对象，而且每次调用都会返回一个新的对象
		 */
		 Supplier<String> str = ()->"hello Duke";
		System.out.println(str.get());//"hello Duke"

		Random random = new Random(314L);
		Supplier<Integer> str2 = ()->random.nextInt(10);
		for(int i=0;i<5;i++){
			System.out.println(str2.get());
		}
	}
}
