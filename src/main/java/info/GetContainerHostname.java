package info;

import java.net.*;

public class GetContainerHostname {
  public static void main(String[] args) throws Exception {
    System.out.println("Container hostname is : "+ InetAddress.getLocalHost().getHosName());
  }
}
