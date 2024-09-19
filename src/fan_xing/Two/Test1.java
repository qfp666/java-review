package fan_xing.Two;

import java.util.ArrayList;
import java.util.List;

public class Test1
{
	public static void main(String[] args)
	{
		//泛型不具有传递性
		add(new ArrayList<t1>());
		//add(new ArrayList<t2>());报错
		add2(new ArrayList<t3>(),null,new ArrayList<t4>());

	}

	public static<E> void add(List<E> a,E...e)
	{
		for(E e1 : e){
			a.add(e1);
		}
	}

	/**
	 * List<? extends Number> 上界通配符 能读不能取
	 * List<? super Number>下界通配符  能取不能读
	 */
	public static void add2(List<? extends Number> list, Number a, List<? super Number> b)
	{
		list.get(0);//读操作
		 b.add(a);//写操作


	}


	public class Number extends  t4{};

	public class  t1{};

	public class t2 extends  t1{};

	public class te extends t2{};

	public class t3 extends Number{};

	public class t4{};

}
