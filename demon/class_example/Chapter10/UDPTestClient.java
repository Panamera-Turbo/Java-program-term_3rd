/**
   源程序：UDPTestClient.java
*/
//发送数据
import java.io.IOException;
import java.net.*;
public class UDPTestClient {
  public static void main(String[] args)throws IOException {
		String s="This is just a test";
		byte[] buf = s.getBytes();
		InetAddress add = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp =
                      new DatagramPacket(buf,buf.length,add,5678);
		DatagramSocket theSocket = new DatagramSocket();
		theSocket.send(dp);
	  }
}
