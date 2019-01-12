
package soap.hello.examples.spyne;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.hello.examples.spyne package. 
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

    private final static QName _SayHelloResponseSayHelloResult_QNAME = new QName("spyne.examples.hello.soap", "say_helloResult");
    private final static QName _StringArray_QNAME = new QName("spyne.examples.hello.soap", "stringArray");
    private final static QName _SayHelloResponse_QNAME = new QName("spyne.examples.hello.soap", "say_helloResponse");
    private final static QName _SayHello_QNAME = new QName("spyne.examples.hello.soap", "say_hello");
    private final static QName _SayHelloName_QNAME = new QName("spyne.examples.hello.soap", "name");
    private final static QName _SayHelloTimes_QNAME = new QName("spyne.examples.hello.soap", "times");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.hello.examples.spyne
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
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "spyne.examples.hello.soap", name = "say_helloResult", scope = SayHelloResponse.class)
    public JAXBElement<StringArray> createSayHelloResponseSayHelloResult(StringArray value) {
        return new JAXBElement<StringArray>(_SayHelloResponseSayHelloResult_QNAME, StringArray.class, SayHelloResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "spyne.examples.hello.soap", name = "stringArray")
    public JAXBElement<StringArray> createStringArray(StringArray value) {
        return new JAXBElement<StringArray>(_StringArray_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "spyne.examples.hello.soap", name = "say_helloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "spyne.examples.hello.soap", name = "say_hello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "spyne.examples.hello.soap", name = "name", scope = SayHello.class)
    public JAXBElement<String> createSayHelloName(String value) {
        return new JAXBElement<String>(_SayHelloName_QNAME, String.class, SayHello.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "spyne.examples.hello.soap", name = "times", scope = SayHello.class)
    public JAXBElement<BigInteger> createSayHelloTimes(BigInteger value) {
        return new JAXBElement<BigInteger>(_SayHelloTimes_QNAME, BigInteger.class, SayHello.class, value);
    }

}
