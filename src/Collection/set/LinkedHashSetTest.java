package Collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * 基于链表和哈希表,维护插入顺序,不允许重复  允许null
 */
public class LinkedHashSetTest
{
	public static void main(String[] args)
	{
		/**
		 * 1.用增强for便利
		 * 2.用迭代器便利
		 * 3.用forEach便利
		 */
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(155);
		linkedHashSet.add(266);
		linkedHashSet.add(399);
		linkedHashSet.add(null);
		for(Integer i : linkedHashSet){
			System.out.println(i);
		}
		linkedHashSet.forEach(i-> System.out.println(i)); //输出155，266，399

		Iterator<Integer> iterator = linkedHashSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}
}
