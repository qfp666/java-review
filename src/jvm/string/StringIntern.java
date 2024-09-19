package jvm.string;

/**
 * jdk 8 intern 如果
 */
public class StringIntern
{
	public static void main(String[] args)
	{
		String s1= new String("qfp");//堆中和字符串常量池都会创建字符串对象  但是s保存的是堆中的地址
		String s2 = s1.intern(); //字符串常量池存在就保存字符串常量池的引用  不存在就直接保存堆对象的引用
		System.out.println(s1==s2); //false

		String s3 = "a"+"b"; //本质是stringbuilder.appernd.toString(); s3只有再堆中被创建
		String s4 = s3.intern();
		System.out.println(s3==s4); //true

	}
}
