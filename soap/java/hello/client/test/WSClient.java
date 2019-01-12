package test;
import service.* ;
public class WSClient {
    public static void main(String[] args) {
        // 创建一个工厂实例
        // HelloServiceImplService 是 wsimport 工具产生的
        HelloServiceImplService factory = new HelloServiceImplService();
        // 通过工厂声称一个实例 HelloServiceImpl 是 wsimport 工具产生的
        HelloServiceImpl helloServiceImpl = factory.getHelloServiceImplPort();
        // 调用其中方法 sayHello
        System.out.println("调用sayHello begin ");
        String remoteResult = helloServiceImpl.sayHello("田圃森");
        System.out.println("调用sayHello 返回结果: "+ remoteResult);

        System.out.println("调用saveHello begin ");
        helloServiceImpl.saveHello("田圃森");
        System.out.println("调用saveHello end");
    }
}
