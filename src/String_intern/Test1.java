package String_intern;

public class Test1
{
	public static void main(String[] args)
	{
		//jdk 7之前    无论字符串常量池有没有该字符串   s1.intern()都会在字符串常量池新建一个对象
		//jdk 7之后 如果字符串常量池中有 所需要的字符串对象  那么 intern()会指向改字符串对象
		String s1 = new String("11"); //
		String s2 = s1.intern();//发现 字符串常量池有改对象 //引用指向字符串常量池的地址
		System.out.println(s1==s2); //false     字符串常量池  和   堆中的对象进行一个比较


		String s3 = "33";
		String s4 = s3.intern();
		System.out.println(s3==s4); //true


		String s5 = new String("二哥") + new String("三妹");  //创建5个对象  其中s5是StringBuilder拼接的字符串对象   放到字符串常量池中
		String s6 = s5.intern();
		System.out.println(s5 == s6);    //true



	}
}
