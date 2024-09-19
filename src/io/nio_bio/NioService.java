package io.nio_bio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

public class NioService
{
	public static void main(String[] args)
	{
		//绑定端口
		try
		{
			//创建ServerSocketChannal
			ServerSocketChannel serverSocketChannal = ServerSocketChannel.open();
			serverSocketChannal.bind(new InetSocketAddress(8081));
			//设置 非阻塞模式
			serverSocketChannal.configureBlocking(false);

			//创建Selector
			Selector selector = Selector.open();
			//将ServerSocketChannel注册到Selector,关注OP_ACCEPT事件
			serverSocketChannal.register(selector,SelectionKey.OP_ACCEPT);

			//无线循环,处理事件
			while(true){
				//阻塞直到有事件发生
				selector.select();
				//获取发生事件的SelectionKey
				Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
				while(iterator.hasNext()){
					SelectionKey key = iterator.next();
					//处理完后 从selectedKeys集合中移除
					iterator.remove();
                   //判断事件类型
					if(key.isAcceptable()){
						//有新的连接请求
						ServerSocketChannel server = (ServerSocketChannel) key.channel();
						//接受连接
						SocketChannel client = server.accept();
						//设置非阻塞模式
						client.configureBlocking(false);
						//将新的SocketChannel注册到Selector,关注OP_READ事件
						client.register(selector,SelectionKey.OP_READ);
					}else if(key.isReadable()){
						//有数据刻可读
						SocketChannel client = (SocketChannel)key.channel();
						//创建ByteBuffer缓冲区
						ByteBuffer buffer = ByteBuffer.allocate(1024);
						//从SocketChannel中读取数据并写入ByteBuffer
						client.read(buffer);
						//翻转ByteBuffer,准备读取
						buffer.flip();
						//将数据从ByteBuffer写回到SocketChanel
						client.write(buffer);
						//关闭连接
						client.close();
					}
				}
			}
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}

	}
}
