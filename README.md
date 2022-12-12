# OpsApplication - Testing OpenLiberty 

This is a simple project made to test WS on openliberty-22.0.0.9.

Build with jdk 1.8 and maven 3.6.3

#The server configuration is
liberty/config/server.xml

#The SoapUI Project to test the application
integration/soapui-opsproject.xml
  There are two request :
    "Request Alternate 500" : contains in the request the field receiptDate
    "Request Always 200" : doesn't contain in the request the field receiptDate


