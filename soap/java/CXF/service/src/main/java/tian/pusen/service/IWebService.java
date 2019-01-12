package tian.pusen.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Administrator on 2019/1/12.
 */
@WebService
public interface IWebService {
    @WebMethod
    String sayHello(@WebParam(name = "name") String name);

    @WebMethod
    String saveInfo(@WebParam(name = "name") String name, @WebParam(name = "info") String info);

}
