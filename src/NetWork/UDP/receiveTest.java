package NetWork.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class receiveTest
{
	public static void main(String[] args) throws IOException
	{
		DatagramSocket datagramSocket = new DatagramSocket(10086);
		byte[] bytes = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
		while(true){
			datagramSocket.receive(dp);
			byte[] data = dp.getData();
			String hostAddress = dp.getAddress().getHostAddress();
			String hostAddress1 = dp.getAddress().getHostName();
			System.out.println("ip为:"+hostAddress+"主机名为"+hostAddress1+"说了"+new String(data,0,dp.getLength()));
		}
	}
}
