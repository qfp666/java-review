package Inner_class_20230726.lambda.consumer_bigConsumer;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class ConsumerTest
{
	public static void main(String[] args)
	{
		/**
		 * 需要使用一个对象用Consumer<T>
		 * Consumer<T>和Supplier<T></>相反,它需要入参,但不返回东西,而且它除了抽象方法(accept(T t)还有一个default方法
		 *
		 */
		Random random = new Random(314L);
		IntSupplier supplier = () -> random.nextInt(10);
		Consumer<Integer> consumer = s -> System.out.println(s);

		for (int i = 0; i < 5; i++)
		{
			consumer.accept(supplier.getAsInt());
		}
	}
}



