package Collection.List;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 读操作不会加锁 可以多线程共享读
 * 写操作会新建一个集合 因此读写操作不会发生并发冲突
 * 适合读多写少的场景
 */
public class CopyOnWriteListTest
{
	public static void main(String[] args)
	{
		CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();

	}
}
