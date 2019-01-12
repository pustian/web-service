IDEA  
service 
pom.xml 引入cxf 包
WebServicePublish.java 使用jdk发布
CFXWebServicePublish.java 使用cxf发布
service
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── tian
    │   │       └── pusen
    │   │           └── service
    │   │               ├── CFXWebServicePublish.java
    │   │               ├── IWebService.java
    │   │               ├── WebServiceImpl.java
    │   │               └── WebServicePublish.java
    │   └── resources
    └── test
        └── java

wsimport -s client/cxf/src/main/ -keep http://localhost:8080/WS_Server/Webservice?wsdl
default.wsdl 使用WebServicePublish.java 发布的内容
wsimport -s client/cxf/src/main/ -keep http://localhost:8989/WS_Server/Webservice?wsdl
cxf.wsdl     使用CFXWebServicePublish.java 发布的内容

注意 cxf/default 中WsClient.java中内容有问题
client
├── cxf
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── tian
│       │   │       └── pusen
│       │   │           ├── client
│       │   │           │   └── WsClient.java
│       │   │           └── service
│       │   │               ├── ObjectFactory.java
│       │   │               ├── package-info.java
│       │   │               ├── SaveInfo.java
│       │   │               ├── SaveInfoResponse.java
│       │   │               ├── SayHello.java
│       │   │               ├── SayHelloResponse.java
│       │   │               ├── WebServiceImpl.java
│       │   │               └── WebServiceImplPortType.java
│       │   └── resources
│       └── test
│           └── java
├── default
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── tian
│       │   │       └── pusen
│       │   │           ├── client
│       │   │           │   └── WsClient.java
│       │   │           └── service
│       │   │               ├── IWebService.java
│       │   │               ├── ObjectFactory.java
│       │   │               ├── package-info.java
│       │   │               ├── SaveInfo.java
│       │   │               ├── SaveInfoResponse.java
│       │   │               ├── SayHello.java
│       │   │               ├── SayHelloResponse.java
│       │   │               └── WebServiceImplService.java
│       │   └── resources
│       └── test
│           └── java
