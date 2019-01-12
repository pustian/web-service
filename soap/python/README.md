https://www.cnblogs.com/guanfuchang/p/5985070.html
Python 开发与测试 Webservice（SOAP）
Python 库选择
服务端开发：选用spyne进行开发了

cd hello-0
python helloService.py
curl http://192.168.1.97:8181/?wsdl
curl http://192.168.1.97:8181/HelloWorldService?wsdl

wsimport -s client/java -keep http://192.168.1.97:8181/HelloWorldService?wsdl
client/java
client/python

cd hello-1
python helloService2.py
curl http://192.168.1.97:5567/?wsdl
curl http://192.168.1.97:5567/SService/?wsdl


