//
// Generated By:JAX-WS RI IBM 2.2.1-07/09/2014 01:52 PM(foreman)- (JAXB RI IBM 2.2.3-07/07/2014 12:54 PM(foreman)-)
//


package com.ibm.ws.policyattachments.client2.service2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "HelloService2", targetNamespace = "http://service2.policyattachments.ws.ibm.com/", wsdlLocation = "http://localhost:8091/policyAttachmentsService2/HelloService2?wsdl")
public class HelloService2_Service
    extends Service
{

    private final static URL HELLOSERVICE2_WSDL_LOCATION;
    private final static WebServiceException HELLOSERVICE2_EXCEPTION;
    private final static QName HELLOSERVICE2_QNAME = new QName("http://service2.policyattachments.ws.ibm.com/", "HelloService2");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8091/policyAttachmentsService2/HelloService2?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOSERVICE2_WSDL_LOCATION = url;
        HELLOSERVICE2_EXCEPTION = e;
    }

    public HelloService2_Service() {
        super(__getWsdlLocation(), HELLOSERVICE2_QNAME);
    }

    public HelloService2_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOSERVICE2_QNAME, features);
    }

    public HelloService2_Service(URL wsdlLocation) {
        super(wsdlLocation, HELLOSERVICE2_QNAME);
    }

    public HelloService2_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOSERVICE2_QNAME, features);
    }

    public HelloService2_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloService2_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloService2
     */
    @WebEndpoint(name = "HelloService2Port")
    public HelloService2 getHelloService2Port() {
        return super.getPort(new QName("http://service2.policyattachments.ws.ibm.com/", "HelloService2Port"), HelloService2.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloService2
     */
    @WebEndpoint(name = "HelloService2Port")
    public HelloService2 getHelloService2Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://service2.policyattachments.ws.ibm.com/", "HelloService2Port"), HelloService2.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOSERVICE2_EXCEPTION!= null) {
            throw HELLOSERVICE2_EXCEPTION;
        }
        return HELLOSERVICE2_WSDL_LOCATION;
    }

}
