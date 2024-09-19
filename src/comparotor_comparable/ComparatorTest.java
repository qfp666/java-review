package comparotor_comparable;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Comparator<T>是函数式接口 有且仅有一个抽象方法
 * Comparator是一个比较器接口 常用于集合的排序规则实现
 */
public class ComparatorTest
{
	public static void main(String[] args)
	{
		/**
		 * 基本类型 int[] long[] double[]只能使用默认升降排序 不接受比较器Comparator
		 */
         Integer a[] = {9,8,7,6,5,4,3,2,1};
		 Arrays.sort(a);
		System.out.println(Arrays.toString(a));//输出 [1, 2, 3, 4, 5, 6, 7, 8, 9]
		 //那通过Comparator接口来更改排序规则


		//匿名内部类
		Arrays.sort(a,new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2)
			{
				return o2-o1;
			}
		});
		System.out.println(Arrays.toString(a));//输出 [9, 8, 7, 6, 5, 4, 3, 2, 1]

		//lambda表达式
		Arrays.sort(a,(o1,o2)->{
			return o1-o2;
		});
		System.out.println(Arrays.toString(a)); //输出[1, 2, 3, 4, 5, 6, 7, 8, 9]


	}
}
