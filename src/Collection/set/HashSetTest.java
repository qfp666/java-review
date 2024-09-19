package Collection.set;

import java.util.HashSet;

/**
 * 基于哈希表,元素无需,不允许重复 允许null
 * jdk8:以前 哈希表是由数组+链表实现  jdk8以后是由数组+链表加红黑树
 */
public class HashSetTest
{
	/**
	 * HashSet 是由数组+链表+红黑树组成的，数组是有索引的，但是存在HashSet 中的元素是通过链表或红黑树的形式挂在数组的每个索引下的，
	 * 也就是每个索引可能对应多个元素，所以HashSet 不能由索引找到对应的元素。
	 */
	public static void main(String[] args)
	{
		HashSet<Integer> hSet = new HashSet<>();
		hSet.add(155);
		hSet.add(266);
		hSet.add(39999);
		hSet.add(null);
		for(Integer i : hSet){
			System.out.println(i);//输出位266 155 3999无序
		}
	}
}
