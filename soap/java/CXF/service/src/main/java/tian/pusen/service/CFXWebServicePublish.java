package tian.pusen.service;

import org.apache.cxf.frontend.ServerFactoryBean;

/**
 * Created by Administrator on 2019/1/12.
 */
public class CFXWebServicePublish {
    public static void main(String[] args) {
        ServerFactoryBean sf=new ServerFactoryBean();
        //服务实现类  
        sf.setServiceClass(WebServiceImpl.class);
        //服务的发布地址  
        sf.setAddress("http://localhost:8989/WS_Server/Webservice");
        //服务的实例  
        sf.setServiceBean(new WebServiceImpl());
        //发布服务  
        sf.create();
        System.out.println("server ready……");
    }
}
