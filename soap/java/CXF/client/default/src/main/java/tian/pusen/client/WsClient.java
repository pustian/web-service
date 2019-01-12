package tian.pusen.client;

import tian.pusen.service.IWebService;
import tian.pusen.service.WebServiceImplService;

/**
 * Created by Administrator on 2019/1/12.
 */
public class WsClient {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebServiceImplService factory = new WebServiceImplService();
        IWebService wsImpl = factory.getWebServiceImplPort();
        String resResult = wsImpl.sayHello("小鱼儿");
        System.out.println("调用WebService的sayHello方法返回的结果是："+resResult);
        System.out.println("---------------------------------------------------");
        resResult = wsImpl.saveInfo("小鱼儿", "欢迎你！");
        System.out.println("调用WebService的saveInfo方法返回的结果是："+resResult);
    }
}
