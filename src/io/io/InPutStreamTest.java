package io.io;

import com.sun.org.apache.bcel.internal.generic.NEW;
import java_zhixing_shunxu.test1.Parent;

import java.io.*;

public class InPutStreamTest
{

	private static final  String  inFileName ="D:\\java-review\\src\\io\\io\\io.text";
	private static final  String  outFileName  = "D:\\java-review\\src\\io\\io\\out.text";
	private static final String  readerFileName = "D:\\java-review\\src\\io\\io\\reader.txt";
	private static final String writerFileName  = "D:\\java-review\\src\\io\\io\\writer.txt";
	public static void main(String[] args) throws FileNotFoundException
	{

		/**
		 * inputStream()是抽象类
		 * 还有bufferInputStream();
		 * 读取也可以不用 字符数组作为缓冲
		 * 直接 int a =  in.read();
		 * out.write(a)这样会比较慢
		 */
		FileInputStream fis = null;//初始化必须在try的外面   否则初始化失败
		FileOutputStream fos = null;
		try
		{
			fis = new FileInputStream(inFileName);
			fos = new FileOutputStream(outFileName);
			byte a[] = new byte[1024];
			int count = 0; //
			while ((count = fis.read(a)) != -1)
			{
				fos.write(a, 0, count);//最好是读多少行写多少行 //
				//out.write(a);//这样会补充null
			}
		}catch (IOException e){
			 e.printStackTrace();
		}finally{
		     if(fis!=null&&fos!=null){
				 try
				 {
					 fis.close();
					 fos.close();
				 }
				 catch (IOException e)
				 {
					e.printStackTrace();
				 }
			 }
		}

		/*在上面的代码示例中，每次运行程序都会创建新的输出流对象，
		于是文件中的数据也会被清空。如果想保留目标文件中的数据，还能继续追加新数据，该怎么办呢？以及如何实现换行呢？*/
		FileOutputStream  fis2  = new FileOutputStream(inFileName,true);


	}
}
