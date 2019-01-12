
package tian.pusen.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tian.pusen.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHello_QNAME = new QName("http://service.pusen.tian/", "sayHello");
    private final static QName _SaveInfo_QNAME = new QName("http://service.pusen.tian/", "saveInfo");
    private final static QName _SayHelloResponse_QNAME = new QName("http://service.pusen.tian/", "sayHelloResponse");
    private final static QName _SaveInfoResponse_QNAME = new QName("http://service.pusen.tian/", "saveInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tian.pusen.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SaveInfoResponse }
     * 
     */
    public SaveInfoResponse createSaveInfoResponse() {
        return new SaveInfoResponse();
    }

    /**
     * Create an instance of {@link SaveInfo }
     * 
     */
    public SaveInfo createSaveInfo() {
        return new SaveInfo();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pusen.tian/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pusen.tian/", name = "saveInfo")
    public JAXBElement<SaveInfo> createSaveInfo(SaveInfo value) {
        return new JAXBElement<SaveInfo>(_SaveInfo_QNAME, SaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pusen.tian/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pusen.tian/", name = "saveInfoResponse")
    public JAXBElement<SaveInfoResponse> createSaveInfoResponse(SaveInfoResponse value) {
        return new JAXBElement<SaveInfoResponse>(_SaveInfoResponse_QNAME, SaveInfoResponse.class, null, value);
    }

}
