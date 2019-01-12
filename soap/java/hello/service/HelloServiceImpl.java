package service;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("sayHello==>Hello "+name);
        return "Hello "+name;
    }

    @Override
    public void saveHello(String name) {
        System.out.println("saveHello=="+name);
    }
}
