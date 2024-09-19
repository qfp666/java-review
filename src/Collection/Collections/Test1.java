package Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1
{
	/**
	 * synchronizedList() 封装成并发安全的synchronizedList();
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<>();
		List<Integer> integers = Collections.synchronizedList(arrayList);
	}
}
