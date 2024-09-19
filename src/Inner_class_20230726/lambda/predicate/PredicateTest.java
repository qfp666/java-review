package Inner_class_20230726.lambda.predicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest
{
	public static void main(String[] args)
	{
		/**
		 * 当需要判断一个对象是否满足某个条件时用Predicate<T>
		 * predicate常常会被用来做过滤
		 */
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		List<String> strings = new ArrayList<>(list);
		Predicate<String> predicate = s -> s.length()%2==0;
		strings.removeIf(predicate);
		System.out.println(strings);

	}
}
