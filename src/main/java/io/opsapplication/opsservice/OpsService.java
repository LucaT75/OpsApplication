package io.opsapplication.opsservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

@WebService(name = "Ops", targetNamespace = "http://opsApplication.io/OpsService/",
        portName="OpsPort",
        endpointInterface="io.opsapplication.opsservice.Ops"
        )
public class OpsService implements Ops {

    @Override
    @WebMethod
    public DocumentMetadata createDocument(DocumentMetadata request) {
        DocumentMetadata dm = new DocumentMetadata();
        dm.setName("Test");
        dm.setNote("Note for test");
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(new Date());
        XMLGregorianCalendar xmlDate = null;
        try {
            xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            dm.setReceiptDate(xmlDate);
        } catch (DatatypeConfigurationException e) {
            // avoid to return date
        }
        return dm;
    }
}
