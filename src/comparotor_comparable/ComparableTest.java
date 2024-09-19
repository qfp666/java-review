package comparotor_comparable;



import java.util.ArrayList;
import java.util.Collections;

/**
 * comparable是一个排序接口
 * 如果你所需要排序的类已经实现了Comparable接口，那么你可以直接使用该类默认的比较规则进行排序。否则，
 * 你可以考虑实现一个或多个Comparator接口，并基于不同的比较规则对同一个类进行排序。
 */
public class ComparableTest
{
	public static void main(String[] args)
	{
		ArrayList<Student> list = new ArrayList<Student>();
	    list.add(new Student(17,"a"));
		list.add(new Student(25,"b"));
		list.add(new Student(17,"c"));
		//记住要使用排序 排序规则才能生效
		Collections.sort(list);
		System.out.println(list);


	}
}
