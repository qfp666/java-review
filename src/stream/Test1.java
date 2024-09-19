package stream;

import jvm.integer.IntegerTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test1
{
	public static void main(String[] args)
	{
		/**
		 * 单列集合      list. stream()
		 * 双列集合       没有‘通过keySet()方法获取 set集合再通过stream方法
		 * 数组        Arrays.stream
		 * 一堆零散数据  Stream。of(1,2,3,4,5,6,7).forEach(s->System.out.println(s))
		 */
		List<Student> list = new ArrayList<>();
		Student student1 = new Student("全",21);
		Student student2 = new Student("福",22);
		Student student3 = new Student("平",23);
		Student student4 = new Student("帅气",24);
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);

		long count = list.stream().count();
		System.out.println(count);

		Map<String,Integer> collect3 = list.stream().collect(Collectors.toMap(Student::getName, Student::getAge));
		Map<String, Student> collect4 = list.stream().collect(Collectors.toMap(s -> s.getName(), s -> s));
		List<Student> collect5 = list.stream().map(s ->
		{
			s.setAge(20);
			return s;
		}).collect(Collectors.toList());
	     for(Student i:collect5){
			 System.out.println(i.getAge());
		 }
		ArrayList<String> arrayList = new ArrayList<>();
		 arrayList.add("张三丰");
		 arrayList.add("全福平");
		 arrayList.add("张全");
		 arrayList.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(s-> System.out.println(s));
		/*System.out.println(collect1);
		System.out.println(collect);*/

		/**
		 * 中间方法
		 *  filite()过滤
		 *  limit(long maxSize)获取前几个元素
		 *  skip(long n)跳过前几个元素
		 *  distinct()去重 依赖hashCode 和equals方法
		 *  concat(stream a,stream b) 合并a和b两个流为一个
		 *  map(s->{             转换流中的数据
		 *      s.setAge(20)
		 *      return s; //返回值代表转换之后的数据
		 *  })
		 */
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("张三丰-1");
		list2.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));
		//s.split("-")[1] 同等于 String []str = s.split("-"); String ageString=str[1] int age = Integer.parseInt(ageString)

		/**
		 * 终结方法
		 * forEach 遍历
		 * count 统计
		 * toArray 转换
		 * collect(Collectors.toMap())
		 */


	}
}
