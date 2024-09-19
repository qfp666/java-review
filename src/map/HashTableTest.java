package map;

import java.util.Hashtable;

/**
 * 不允许null键或null值
 */
public class HashTableTest
{
	public static void main(String[] args)
	{
		Hashtable<String, String> hTable = new Hashtable<String, String>();
		hTable.put(null,"66");//NullPointerException
		hTable.put("55",null);//NullPointerException
	}
}
