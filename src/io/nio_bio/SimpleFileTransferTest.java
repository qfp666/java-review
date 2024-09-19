package io.nio_bio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class SimpleFileTransferTest
{
	//使用传统的I/O 方法传输文件
	private long transferFile(File source,File des) throws IOException
	{
		long startTime = System.currentTimeMillis();
		if(!des.exists()){
			des.createNewFile();
		}

		// 创建输入输出流
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(des));

		//使用数组传输数据
		byte [] bytes = new byte[1024*1024];
		int len;
		while((len=bis.read(bytes))!=-1){
			bos.write(bytes,0,len);
		}
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}

	//使用 NIO 方法传输文件
	private long transFileWithNio(File source,File des) throws IOException
	{
		long startTime = System.currentTimeMillis();
		if(!des.exists()){
			des.createNewFile();
		}

		//创建随机存取文件对象
		RandomAccessFile read = new RandomAccessFile(source, "rw");
		RandomAccessFile write = new RandomAccessFile(des, "rw");

		//获取文件通道
		FileChannel readChannel = read.getChannel();
		FileChannel writeChannel = write.getChannel();

		//创建并使用   ByteBuffer 传输数据
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024*1024);
		while(readChannel.read(byteBuffer)>0){
			byteBuffer.flip();
			writeChannel.write(byteBuffer);
			byteBuffer.clear();
	    }

		//关闭文件通道
		readChannel.close();
		writeChannel.close();
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}

	public static void main(String[] args) throws IOException
	{
		SimpleFileTransferTest simpleFileTransferTest = new SimpleFileTransferTest();
		File source = new File("1.jpg");
		//File des = new File("io.avi");
		File des = new File("2.jpg");
		File nio = new File("nio.avi");

		//比较传统的I/O 和 NIO传输文件的时间
		long timeBio = simpleFileTransferTest.transferFile(source, des);
		System.out.println(timeBio+"普通字节流时间");

	}
}
