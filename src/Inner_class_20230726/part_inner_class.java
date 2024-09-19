package Inner_class_20230726;

/**
 * 局部内部类
 */
public class part_inner_class
{
	private static  String sex="男";
	public part_inner_class print(){
		/*局部内部类就好像一个局部变量一样，它是不能被权限修饰符修饰的，
		比如说 public、protected、private 和 static 等。*/
		class Wangxiaosan extends  part_inner_class{
			private  int age = 18;
		}
		return new Wangxiaosan();
	}

	public static void main(String[] args)
	{
		new part_inner_class().print();
	}
}
