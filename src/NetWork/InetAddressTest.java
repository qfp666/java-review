package NetWork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest
{
	public static void main(String[] args) throws UnknownHostException
	{
		InetAddress byName = InetAddress.getByName("192.168.101.1");
		String hostName = byName.getHostName();
		System.out.println(hostName);
		InetAddress byName1 = InetAddress.getByName("LAPTOP-G3GR5HKH");
		String hostAddress = byName1.getHostAddress();
		byte[] address = byName1.getAddress();
		for(int i=0;i<address.length;i++){
			System.out.println(address[i]);
		}
		System.out.println(hostAddress);
	}
}
