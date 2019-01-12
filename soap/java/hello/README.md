http://www.cnblogs.com/fengwenzhee/p/6915606.html

web service就是远程调用技术,也叫XML Web Service.
    WebService是一种可以接收从Internet或者Intranet上的其它系统中传递过来的请求，轻量级的独立的通讯技术。
    是:通过SOAP在Web上提供的软件服务，使用WSDL文件进行说明，并通过UDDI进行注册。
XML：(Extensible Markup Language)扩展型可标记语言。
    面向短期的临时数据处理、面向万维网络，是Soap的基础。
Soap：(Simple Object Access Protocol)简单对象存取协议。
    是XML Web Service 的通信协议。
    当用户通过UDDI找到你的WSDL描述文档后，他通过可以SOAP调用你建立的Web服务中的一个或多个操作。
    SOAP是XML文档形式的调用方法的规范，它可以支持不同的底层接口，像HTTP(S)或者SMTP。
WSDL：(Web Services Description Language) WSDL 文件是一个 XML 文档，
    用于说明一组 SOAP 消息以及如何交换这些消息。大多数情况下由软件自动生成和使用。 
## 服务端源码
vim service/HelloService.java       接口
vim service/HelloServiceImpl.java   实现
vim service/ServicePublish.java     发布  main
# 运行服务端代码
javac service/HelloService.java    
javac service/HelloServiceImpl.java
javac service/ServicePublish.java  
## 运行服务端
java service/ServicePublish &
# 检查webService的服务
curl http://192.168.1.97:8989/WS_Server/HelloService
使用 service/ServicePublish.java 中address 浏览器

# 生成的客户端代码
mkdir client
wsimport -s client/ -keep http://192.168.1.97:8989/WS_Server/HelloService?wsdl
cd client
## 客户端测试代码
vim test/WSClient.java
# 生成的客户端代码
javac service/HelloServiceImpl.java
javac service/HelloServiceImplService.java
javac service/ObjectFactory.java
javac service/package-info.java
javac service/SaveHello.java
javac service/SaveHelloResponse.java
javac service/SayHello.java
javac service/SayHelloResponse.java
# 客户端测试代码
javac test/WSClient.java
## 运行客户端
java test/WSClient

