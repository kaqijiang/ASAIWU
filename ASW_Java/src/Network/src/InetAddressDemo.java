import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressDemo {
    public static void main(String[] args) {

        System.out.println("获取网络地址");


        try {
            InetAddress inetAddress;
            inetAddress = java.net.InetAddress.getByName("192.168.0.8");
            String hostName = inetAddress.getHostName();
            String hostIp = inetAddress.getHostAddress();

            System.out.println(hostName);
            System.out.println(hostIp);

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
