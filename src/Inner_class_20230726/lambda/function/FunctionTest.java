package Inner_class_20230726.lambda.function;

import java.util.function.Function;

public class FunctionTest
{
	public static void main(String[] args)
	{
		/**
		 * .从一个类型映射到另一个类型用Function<T, R>
		 */

		Function<String,String> function =  s->{
			System.out.println(s);
			return s.toString();
		};
		String hello = function.apply("hello");
		System.out.println("hello");

		Function<Integer,Integer> addFunction  = s->{
			System.out.println(s+10);
			return s;
		};
		Integer add = add(10, addFunction);
		System.out.println(add);
	}

	public static <T, R> Integer add(T t,Function<T, R> function)
	{
		System.out.println("66666");
		Integer r = (Integer) function.apply(t);
		System.out.println("88888");
		return r;
	}

	Function<String, Integer> toLength = s -> s.length();
	String word = "hello quanfuping"; // any kind of word will do
	int length = toLength.apply(word);
}
