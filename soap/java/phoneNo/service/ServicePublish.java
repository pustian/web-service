package service;

import javax.xml.ws.Endpoint;

public class ServicePublish {
    public static void main(String[] args) {
        String address="http://192.168.1.97:8989/WS_Server/PhoneAddress";
        // service
        PhoneAddress phoneAddress = new PhoneAddressImpl();
        Endpoint.publish(address, phoneAddress);
        System.out.println("publish webservice successfully");
    }
}
