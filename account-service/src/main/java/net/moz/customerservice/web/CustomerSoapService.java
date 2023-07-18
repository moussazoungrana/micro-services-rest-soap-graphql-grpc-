package net.moz.customerservice.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-07-18T19:25:27.457+01:00
 * Generated source version: 4.0.0
 *
 */
@WebService(targetNamespace = "http://web.customerservice.moz.net/", name = "CustomerSoapService")
@XmlSeeAlso({ObjectFactory.class})
public interface CustomerSoapService {

    @WebMethod
    @RequestWrapper(localName = "saveCustomer", targetNamespace = "http://web.customerservice.moz.net/", className = "net.moz.customerservice.web.SaveCustomer")
    @ResponseWrapper(localName = "saveCustomerResponse", targetNamespace = "http://web.customerservice.moz.net/", className = "net.moz.customerservice.web.SaveCustomerResponse")
    @WebResult(name = "return", targetNamespace = "")
    public net.moz.customerservice.web.Customer saveCustomer(

        @WebParam(name = "customer", targetNamespace = "")
        net.moz.customerservice.web.CustomerRequest customer
    );

    @WebMethod
    @RequestWrapper(localName = "customerById", targetNamespace = "http://web.customerservice.moz.net/", className = "net.moz.customerservice.web.CustomerById")
    @ResponseWrapper(localName = "customerByIdResponse", targetNamespace = "http://web.customerservice.moz.net/", className = "net.moz.customerservice.web.CustomerByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public net.moz.customerservice.web.Customer customerById(

        @WebParam(name = "id", targetNamespace = "")
        java.lang.Long id
    );

    @WebMethod
    @RequestWrapper(localName = "customerList", targetNamespace = "http://web.customerservice.moz.net/", className = "net.moz.customerservice.web.CustomerList")
    @ResponseWrapper(localName = "customerListResponse", targetNamespace = "http://web.customerservice.moz.net/", className = "net.moz.customerservice.web.CustomerListResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<net.moz.customerservice.web.Customer> customerList()
;
}
