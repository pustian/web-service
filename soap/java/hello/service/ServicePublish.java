package service;

import javax.xml.ws.Endpoint;

public class ServicePublish {
    public static void main(String[] args) {
        String address="http://192.168.1.97:8989/WS_Server/HelloService";
        HelloService helloService = new HelloServiceImpl();
        Endpoint.publish(address, helloService);
        System.out.println("publish webservice successfully");
    }
}
