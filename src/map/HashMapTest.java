package map;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 允许一个null键或多个null值
 * null键可以通过 containsKey()这个方法进行判断
 */
public class HashMapTest
{
	public static void main(String[] args)
	{
		/**
		 * hashMap计算索引位置 (1.计算key的hash值,2((数组长度-1)&key的hash值获取索引位置)
		 * 2.jdk1.7:数组+链表(头插法)
		 * 3.jdk1.8:数组+链表+红黑树(尾插法）
		 * 4.负载因子默认0.75 数组默认长度位16  数组长度大于12触发扩容机制
		 * 5.数组长度大于等于64  链表长度大于8  链表转为树(牺牲了空间换时间)
		 * 6.扩容  两倍( 通过key的hash值&旧数组长度) 要么为0 要么为1
		 * 7.  0就是原数组位置不变  1 当前索引位置+老数组位置
		 * 8. jdk1.8扩容两倍为啥？  1.哈希分布更加均匀    2.进行&操作运算更快
		 *
		 * hash因子<0.75  太小 浪费空间 频繁扩容 增加扩容开小
		 * >0.75 太大 利用空间   但会增加hash碰撞  查找效率变慢
		 * 链表长度小于6退化树吧 留个缓冲余地 不然8变9 ，9变8
		 * 链表的频繁树化 和 反树化 会有很大的开销
		 */
		HashMap<String, String> hMap = new HashMap<>();
		hMap.put(null,"全福平");
		if(hMap.containsKey(null)){
			System.out.println(666666666);
		}
	}
}
