
package io.opsapplication.opsservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.opsapplication.opsservice package. 
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

    private final static QName _CreateDocument_QNAME = new QName("http://opsApplication.io/OpsService/", "createDocument");
    private final static QName _CreateDocumentResponse_QNAME = new QName("http://opsApplication.io/OpsService/", "createDocumentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.opsapplication.opsservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateDocument }
     * 
     */
    public CreateDocument createCreateDocument() {
        return new CreateDocument();
    }

    /**
     * Create an instance of {@link CreateDocumentResponse }
     * 
     */
    public CreateDocumentResponse createCreateDocumentResponse() {
        return new CreateDocumentResponse();
    }

    /**
     * Create an instance of {@link DocumentMetadata }
     * 
     */
    public DocumentMetadata createDocumentMetadata() {
        return new DocumentMetadata();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opsApplication.io/OpsService/", name = "createDocument")
    public JAXBElement<CreateDocument> createCreateDocument(CreateDocument value) {
        return new JAXBElement<CreateDocument>(_CreateDocument_QNAME, CreateDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opsApplication.io/OpsService/", name = "createDocumentResponse")
    public JAXBElement<CreateDocumentResponse> createCreateDocumentResponse(CreateDocumentResponse value) {
        return new JAXBElement<CreateDocumentResponse>(_CreateDocumentResponse_QNAME, CreateDocumentResponse.class, null, value);
    }

}
