package Optional_20230726;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Optional;

public class Optional_Test
{
	public static void main(String[] args)
	{
		/**
		 * Optional.empty()创建的是空的Optional对象
		 */
		Optional<Object> empty = Optional.empty();
		System.out.println(empty);  //打印的是Optional.empty

		/**
		 *    Optional.of()创建的是不会空的Optional对象
		 *    也就是传递的值不能为null 不然会报错 NullPointerException
		 */
//		String name = null;
//		Optional<ObjectTest> o = Optional.of(null);
//		Optional<String> o1 = Optional.of(name);
//		System.out.println(o);
//		System.out.println(o1);

		/**
		 *   Optional.ofNullable()创建的是可以空也可以不会空的Optional对象
		 *   方法传入null值或对象都行
		 */
		String name2 = null;
		String name3 = "quan";
		Optional<String> empty2 = Optional.ofNullable(name2);
		Optional<String> optional3 = Optional.ofNullable(name3);
		System.out.println(empty2); //打印的是Optional.empty();
		System.out.println(optional3); //打印的是 Optional[quan]
		/**
		 *      ofNullable() 方法内部有一个三元表达式，如果参数为 null调用 Optional.empty()方法 则返回私有常量 EMPTY,
		 * 		否则使用调用Optional.of()方法里面使用了 new 关键字创建了一个新的 Optional 对象——不会再抛出 NPE 异常了。
		 */

		/**
		 *  可以通过方法 isPresent() 判断一个 Optional 对象是否存在，如果存在，该方法返回 true，
		 *  否则返回 false——取代了 obj != null 的判断。
		 */
		Optional<String> opt1 = Optional.of("全福平");
		System.out.println(opt1.isPresent());  // true
		Optional<Object> opt2 = Optional.ofNullable(null);
		System.out.println(opt2.isPresent());  // false;
		Optional<String> s = Optional.ofNullable("6666");


		/**
		 * jdk 11 Optional 对象还有个isEmpty()方法
		 * 他的判断结果 与  isPresent相反
		 */

		/**
		 * 非空表达式-ifPresent() 可以用链式编程 我们不需要先调用isPresent()方法
		 * 判断改对象为空
		 * 而是直接采用ifPresent()如果为空就可以直接打印
		 *
		 */
		Optional<String> optOrNull = Optional.ofNullable(null);
		optOrNull.ifPresent(q-> System.out.println(q.length()));//不打印



		Optional<String> opt = Optional.of("帅气全福平");
		opt.ifPresent(str-> System.out.println(str));//打印5

		/**
		 * 常用工具类StringUtils
		 * org.springframework.util.StringUtils 是 Spring Framework 中的一个实用工具类，用于执行各种字符串相关的操作。
		 */
		/*StringUtils.isEmpty(str)   null 和""返回true  长度为0 其他返回false
		* StringUtils.hashText(stt)  null和" ""  " 都返回false 其他返回true
		*StringUtils.isBlank(str)  无论是null 还是"" "  " 都会返回true
		* */




	}
}
