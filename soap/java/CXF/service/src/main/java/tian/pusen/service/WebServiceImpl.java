package tian.pusen.service;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Administrator on 2019/1/12.
 */
@WebService
public class WebServiceImpl implements IWebService {
    @Override
    public String sayHello(@WebParam(name="name") String name) {
        // TODO Auto-generated method stub
        System.out.println("WebService sayHello "+name);
        return "sayHello "+name;
    }

    @Override
    public String saveInfo(@WebParam(name="name") String name,@WebParam(name="info") String info) {
        // TODO Auto-generated method stub
        System.out.println(name+"调用WebService接口,save:"+info);
        return "save Success";
    }
}
