Web Service
    https://www.javatpoint.com/restful-web-services
1, 定义---So web service is a language independent way of communication.
    WebService是一种跨编程语言和跨操作系统平台的远程调用技术。
    is a client server application or application component for communication.
    method of communication between two devices over network.
    is a software system for interoperable machine to machine communication.
    is a collection of standards or protocols for exchanging information between two devices or application.
2, Types of Web Services
     There are mainly two types of web services.  
        SOAP web services.  
        RESTful web services.
            RESTful 简化了 web service 的设计，它不再需要 wsdl ，也不再需要 soap 协议，而是通过最简单的 http 协议传输数据 ( 包括 xml 或 json) 。既简化了设计，也减少了网络传输量（因为只传输代表数据的 xml 或 json ，没有额外的 xml 包装）。

        相对而言，SOAP协议属于复杂的、重量级的协议， 当前随着Web2.0的兴起，表述性状态转移（Representational State Transfer，REST）逐步成为一个流行的架构风格。 REST是一种轻量级的Web Service架构风格，其实现和操作比SOAP和XML-RPC更为简洁，可以完全通过HTTP协议实现，
        REST是一种架构风格，其核心是面向资源，REST专门针对网络应用设计和开发方式，以降低开发的复杂性，提高系统的可伸缩性。
        SOAP偏向于面向活动，有严格的规范和标准，包括安全，事务等各个方面的内容。 
        　　SOAP强调操作方法和操作对象的分离，有WSDL文件规范和XSD文件分别对其定义。
   　　　　 REST强调面向资源，只要我们要操作的对象可以抽象为资源即可以使用REST架构风格。
    　　如何确定使用REST：
    　　　　若本身只是简单的CRUD业务操作，那么抽象资源就比较容易。
    　　　　而对于复杂的业务活动抽象资源并不是一个简单的事情，比如校验用户等级，转账，事务处理等。
    　　如何确定使用SOAP：
    　　　　若有严格的规范和标准定义要求，且前期需要指导多个业务系统集成和开发的时，
    　　　　因SOAP风格有清晰的规范标准定义，SOAP更适合。
    　　　　我们可以在开始和实现之前就严格定义相关的接口方法和接口传输数据。
3, Web Service Components
    XML+XSD,SOAP和WSDL就是构成WebService平台的三大技术。
    SOAP --- SOAP is an acronym for Simple Object Access Protocol.  SOAP协议 = HTTP协议 + XML数据格式
        SOAP is a XML-based protocol for accessing web services.  
        SOAP is a W3C recommendation for communication between applications.  
        SOAP is XML based, so it is platform independent and language independent. 
            In other words, it can be used with Java, .Net or PHP language on any platform.
    WSDL --- WSDL is an acronym for Web Services Description Language.
        WSDL is a xml document containing information about web services such as method name, method parameter and how to access it.  
        WSDL is a part of UDDI. It acts as a interface between web service applications.  
        WSDL is pronounced as wiz-dull.
    UDDI --- UDDI is an acronym for Universal Description, Discovery and Integration.
        UDDI is a XML based framework for describing, discovering and integrating web services.  
        UDDI is a directory of web service interfaces described by WSDL, containing information about web services.


XML to tag the data
SOAP to transfer a message
WSDL to describe the availability of service.


