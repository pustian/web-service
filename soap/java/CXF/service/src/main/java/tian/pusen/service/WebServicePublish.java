package tian.pusen.service;

import javax.xml.ws.Endpoint;

/**
 * Created by Administrator on 2019/1/12.
 */
public class WebServicePublish {
    public static void main(String[] args) {
        String address = "http://localhost:8080/WS_Server/Webservice";
        Endpoint.publish(address , new WebServiceImpl());
        System.out.println("发布webservice成功!");
    }
}
