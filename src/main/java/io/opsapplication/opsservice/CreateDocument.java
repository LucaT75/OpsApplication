
package io.opsapplication.opsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createDocument complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://opsApplication.io/OpsService/}documentMetadata" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createDocument", propOrder = {
    "request"
})
public class CreateDocument {

    protected DocumentMetadata request;

    /**
     * Get request
     *
     * @return
     *     possible object is
     *     {@link DocumentMetadata }
     *
     */
    public DocumentMetadata getRequest() {
        return request;
    }

    /**
     * Set request
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentMetadata }
     *     
     */
    public void setRequest(DocumentMetadata value) {
        this.request = value;
    }

}
