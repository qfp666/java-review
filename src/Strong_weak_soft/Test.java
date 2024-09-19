package Strong_weak_soft;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Test
{
	public static void main(String[] args)
	{
		String s= new String("abc");
		SoftReference<String> studentSoftReference = new SoftReference<>(s);
		s = null;
		System.gc();
		System.out.println(studentSoftReference.get());

		String s2= new String("abc");
		WeakReference<String> stringWeakReference = new WeakReference<>(s2);
		s2=null;
		System.gc();
		System.out.println(stringWeakReference.get());

		//jvm
		/**
		 *  -Xms
		 *  -Xmx
		 *  -Xss
		 * -XXSurvivorRatio=8  survivor.eden=2:8
		 * -XX:MaxTenuringThreshold = threshold 年轻代晋升老年代阈值 默认是15      范围0-15
		 * -XX:UseParallelGc
		 * -XX:UseParallelOlGc
		 * -XX:UseG1Gc
		 */

	}
}
