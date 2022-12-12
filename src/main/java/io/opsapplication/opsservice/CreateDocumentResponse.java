
package io.opsapplication.opsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createDocumentResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createDocumentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://opsApplication.io/OpsService/}documentMetadata" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createDocumentResponse", propOrder = {
    "response"
})
public class CreateDocumentResponse {

    protected DocumentMetadata response;

    /**
     * Get response
     * 
     * @return
     *     possible object is
     *     {@link DocumentMetadata }
     *     
     */
    public DocumentMetadata getResponse() {
        return response;
    }

    /**
     * Set response
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentMetadata }
     *     
     */
    public void setResponse(DocumentMetadata value) {
        this.response = value;
    }

}
