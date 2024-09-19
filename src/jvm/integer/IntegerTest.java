package jvm.integer;
public class IntegerTest
{
	public static void main(String[] args)
	{
		Integer a = 128;
		Integer b = 128;
		Integer c = 127;
		Integer d = 127;
		int e = 300;
		Integer f = 300;
		int g = 500;
		Integer h = new Integer(500);
		Integer i = 500;
		Integer j = new Integer(600);
		Integer k = new Integer(600);
		/**
		 * 装箱Integer.valueOf();
		 * 拆箱Integer.intValue();
		 * Integer.valueOf() 和 Integer = 的复制都会先采用缓存中的数据
		 * new 的则不考虑
		 * 这是因为Integer类型变量在比较时会自动拆箱，将其转换为int类型进行比较
		 * Integer a =300; int b = 300  a==b(true)
		 *
		 */
		//不在-128~127所以错
		System.out.println(a == b); //false
		System.out.println(c == d);//true
		//基本数据类型和包装数据类型比的是值
		System.out.println(e == f);//true
		System.out.println(g == h);//true
		//new 出来的是地址比值报错
		System.out.println(h == i);//false
		//两个都是new 出来的也是比值
		System.out.println(j == k);//false

	}
}
