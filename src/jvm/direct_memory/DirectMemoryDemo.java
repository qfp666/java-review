package jvm.direct_memory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class DirectMemoryDemo
{

	private static final String FROM  = "D:\\java-review\\ioIn.avi";

	private static final String TO  =  "D:\\java-review\\ioOut.avi";

	private static int _1MB = 1024 * 1024;

	public static void main(String[] args)
	{
         DirectMemoryNio();
		 io();
	}

	/**
	 * int read()：读取数据
	 * int read(byte b[], int off, int len)：从第 off 位置开始读，读取 len 长度的字节，然后放入数组 b 中
	 * long skip(long n)：跳过指定个数的字节
	 * int available()：返回可读的字节数
	 * void close()：关闭流，释放资源
	 *
	 *
	 * void write(int b)： 写入一个字节，虽然参数是一个 int 类型，但只有低 8 位才会写入，高 24 位会舍弃（这块后面再讲）
	 * void write(byte b[], int off, int len)： 将数组 b 中的从 off 位置开始，长度为 len 的字节写入
	 * void flush()： 强制刷新，将缓冲区的数据写入
	 * void close()：关闭流
	 */

	public static void DirectMemoryNio(){
		long l = System.nanoTime();
		try(FileChannel from = new FileInputStream(FROM).getChannel();
			FileChannel to = new FileOutputStream(TO ).getChannel();)
			{
				ByteBuffer bb = ByteBuffer.allocateDirect(_1MB);//定义直接缓存区大小
                  while(true){
               int len = from.read(bb);//默认为读模式 读缓冲区内容
			   if(len==-1){
				   break;
			   }
			   bb.flip();//切换成读模式
			   to.write(bb);
			   bb.clear();//切换成写模式
			  // bb.compact()//也是切换成写模式但是不一样
			}
		}catch (IOException e){
			e.printStackTrace();
		}

		long l2 = System.nanoTime()- l;
		System.out.println("nio直接内存读写需要时间为"+l2);
	}

	public static void io(){
		long l = System.nanoTime();
		try(FileInputStream io = new FileInputStream(FROM);
		   FileOutputStream out = new FileOutputStream(TO);
		){
			byte [] buf= new byte[_1MB];
			while(true){
				int len =  io.read(buf);//相当于io.read(buf,o,buf.length)
				if(len==-1){
					break;
				}
				out.write(buf,0,len);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		long l2 = System.nanoTime()- l;
		System.out.println("io读写需要时间为"+l2);
	}
}
