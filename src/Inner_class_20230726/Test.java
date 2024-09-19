package Inner_class_20230726;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * Comparator<T>定义用于集合的排序规则
 * Comparable<T>用于定义值的排序规则 例如对象....
 */
public class Test
{
	public static void main(String[] args)
	{
		Integer[] a = new Integer[] { 1, 2, 3, 4, 5 };
		/**
		 * 匿名内部类（抽象方法
		 */
		Arrays.sort(a, new Comparator<Integer>()
		{
			@Override
			public int compare(Integer o1, Integer o2)
			{
				return o1-o2;
			}
		});

		/**
		 * lambda表达式(函数式接口);
		 */
		Arrays.sort(a,(s1,s2)->{
			return s1-s2;
		});

		/**
		 * 方法的引用
		 * 1.必须是函数式接口
		 * 2.引用的方法必须存在,
		 * 3.被引用的方法返回值和形参必须和抽象方法保持一致
		 * 4.被引用方法的功能需要满足当前的要求
		 */
		//表示引用Test类里面的substraction方法
		//把这个方法当做抽象方法的方法体
		Arrays.sort(a,Test::substraction);

		/**
		 * 静态方法的引用调用java写好的
		 */
		ArrayList<String> al = new ArrayList<String>();
		Collections.addAll(al, "1", "2", "3", "4", "5", "6", "7", "8", "9");

		//匿名内部类
		al.stream().map(new Function<String, Integer>()
		{
			@Override
			public Integer apply(String s)
			{
				return Integer.parseInt(s);
			}
		});

		//静态引用
		al.stream().map(Integer::parseInt).forEach(System.out::println);

		/**
 		 * 引用成员方法  对象::方法  this::方法    super::方法
		 */

		/**
		 * 引用构造方法  类::new 创建对象
		 * 构造方法也要与抽象方法的方法参数返回值一致
		 *
		 * public student(String str){
		 *       String [] arr= str.spilit(",");
		 *       this.name=arr[0];
		 *       this.age = Integer.parseInt(arr[1]);
		 * }
		 *
		 * list.stream().map(Student::new).forEach();
		 */

		/**
		 * 类名引用成员方法String::toUpperCase
		 */
		al.stream().map(new Function<String, String>()
		{
			@Override
			public String apply(String s)
			{
				return s.toUpperCase();
			}
		});
		/**
		 *  第一个参数代表stream流的数据   表示被引用方法的调用者 决定了可以引用那些类的成员方法
		 *  如果没有第二个参数 说明被引用的方法需要时无参的成员方法
		 *  下面就是每个数据区调用toUpperCase（）方法
		 */
		al.stream().map(String::toUpperCase).forEach(System.out::println);

		/**
		 * 引用数组的构造方法 数组的类型要与与流中数据的类型保持一致
		 */

		ArrayList<Integer> as = new ArrayList<Integer>();
		Collections.addAll(as, 1, 2, 3, 4, 5);
		as.stream().toArray(new IntFunction<Integer[]>()
		{
			@Override
			public Integer[]apply(int value)
			{
				return new Integer[value];
			}
		});

		as.stream().toArray(Integer[]::new);
	}

	public static int substraction(int num1,int num2){
		return num1-num2;
	}
}
