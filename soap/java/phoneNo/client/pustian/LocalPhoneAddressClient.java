package pustian;

import service.PhoneAddressImpl;
import service.PhoneAddressImplService;
import java.util.*;

public class LocalPhoneAddressClient{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        boolean isPhoneNo = true;

        System.out.print("Input PhoneNo=");
        String phoneNo = sc.next();
        if(isPhoneNo) {
            String phoenAddr = getPhoneAddress(phoneNo);
            System.out.println("PhoneNo="+phoneNo+" Address=" + phoenAddr);
        }
    }

    public static String getPhoneAddress(String phoneNo) {
        // 创建一个工厂实例
        // PhoneAddressImplService 是 wsimport 工具产生的
        PhoneAddressImplService factory = new PhoneAddressImplService();
        // 通过工厂声称一个实例 PhoneAddressImpl  是 wsimport 工具产生的
        PhoneAddressImpl  serviceImpl = factory.getPhoneAddressImplPort();
        // 调用其中方法 sayHello
        System.out.println("调用sayHello begin ");
        String remoteResult = serviceImpl.getMobileCodeInfo(phoneNo, "");
        System.out.println("调用sayHello 返回结果: "+ remoteResult);
        return remoteResult;
    }
}
