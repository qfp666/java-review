package Collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 基于红黑树,元素有序,不允许重复（元素有序是通过实现Comparable接口的Comparator()方法来实现）
 * 不允许null
 */
public class TreeSetTest
{
	public static void main(String[] args)
	{
		/**
		 * 匿名内部类格式:类、抽象类、或者接口{继承实现方法}  new Comparator(){
		 *
		 * }
		 */
		TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>()
		{
			@Override
			public int compare(Integer o1, Integer o2)
			{
				return o2-o1;//重置排序 逆序
			}
		});
		treeSet.add(155);
		//treeSet.add(null);

		treeSet.add(266);
		treeSet.add(399);
		Iterator<Integer> iterator = treeSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
