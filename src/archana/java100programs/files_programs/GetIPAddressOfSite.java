package archana.java100programs.files_programs;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAddressOfSite {
    public static void main(String[] args) {
            //IP : Internet Protocol address
            try{
                InetAddress ip = InetAddress.getByName("www.Technolamror.com");
                System.out.println("Host name :"+ip.getHostAddress());
                System.out.println("Ip Address" +ip.getHostAddress());

            }catch( Exception e ){
                System.out.println(e);
            }
    }
}
