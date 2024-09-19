package NetWork.UDP;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class sentTest
{
	public static void main(String[] args) throws IOException
	{
		DatagramSocket ds = new DatagramSocket();
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("请输入要说的话");
			String s = scanner.next();
			if(s.equals("886")){
				break;
			}
			byte[] bytes = s.getBytes();

			InetAddress address = InetAddress.getByName("192.168.101.1");
			int port = 10086;
			DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
			ds.send(dp);

		}
		ds.close();

		/**
		 * 组播  发送端
		 */
		MulticastSocket multicastSocket = new MulticastSocket();
		//multicastSocket.send();
		InetAddress byName = InetAddress.getByName("224.0.0.1");

		/**
		 * 接收端
		 */
		/*multicastSocket.receive();*/
		multicastSocket.joinGroup(byName);// 将当前本机加入到224.0.0.1这个组中

	}
}
