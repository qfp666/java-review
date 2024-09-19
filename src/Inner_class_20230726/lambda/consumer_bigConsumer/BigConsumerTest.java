package Inner_class_20230726.lambda.consumer_bigConsumer;

import java.util.Random;
import java.util.function.BiConsumer;

public class BigConsumerTest
{
	public static void main(String[] args)
	{
		BiConsumer<Random, Integer> consumer = (r, n) -> {
			for (int j = 0; j < n; j++) {
				System.out.println(r.nextInt(10));
			}
		};

		consumer.accept(new Random(314L), 5);

	}
}
