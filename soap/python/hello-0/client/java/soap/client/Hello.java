package soap.client;

import soap.hello.examples.spyne.*;
import java.math.BigInteger;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        System.out.println("BEGIN");
        HelloWorldService factory = new HelloWorldService();
        Application application = factory.getApplication();
        BigInteger bigint = new BigInteger("2");
        StringArray strings = application.sayHello("tianpusen", bigint);
        List<String> lists = strings.getString();
        for(int i=0; i < lists.size(); ++i) {
            System.out.println("i=" + i + "  " + lists.get(i));
        }
        System.out.println("END");
    }
}
