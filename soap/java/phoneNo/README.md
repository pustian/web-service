W3C组织对其的定义如下，它是一个软件系统，为了支持跨网络的机器间相互操作交互而设计。
    Web Service服务通常被定义为一组模块化的API，它们可以通过网络进行调用，来执行远程系统的请求服务。
    简单的说：WebService即Web服务，它是一种跨编程语言和跨操作系统平台的远程调用技术。

phoneNo 

http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx
原生态WebService客户端编写 
wsimport -s client http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl
编写WebService客户端接口
vim cn/com/pustian/PhoneAddressClient.java

javac cn/com/webxml/ArrayOfString.java
javac cn/com/webxml/GetDatabaseInfo.java
javac cn/com/webxml/GetDatabaseInfoResponse.java
javac cn/com/webxml/GetMobileCodeInfo.java
javac cn/com/webxml/GetMobileCodeInfoResponse.java
javac cn/com/webxml/MobileCodeWS.java
javac cn/com/webxml/MobileCodeWSSoap.java
javac cn/com/webxml/ObjectFactory.java
javac cn/com/webxml/package-info.java

javac cn/com/pustian/PhoneAddressClient.java
java cn/com/pustian/PhoneAddressClient

自己写服务端
vim service/PhoneAddressImpl.class
vim service/PhoneAddress.java
vim service/ServicePublish.java

javac service/ServicePublish.java

java service/ServicePublish

http://192.168.1.97:8989/WS_Server/PhoneAddress
http://192.168.1.97:8989/WS_Server/PhoneAddress?wsdl

wsimport -s client http://192.168.1.97:8989/WS_Server/PhoneAddress?wsdl

