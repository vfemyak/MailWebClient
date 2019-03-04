
package com.epam.web.soap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "CsvRequiredFieldEmptyException", targetNamespace = "http://soap.web.epam.com/")
public class CsvRequiredFieldEmptyException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CsvRequiredFieldEmptyException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public CsvRequiredFieldEmptyException_Exception(String message, CsvRequiredFieldEmptyException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CsvRequiredFieldEmptyException_Exception(String message, CsvRequiredFieldEmptyException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.epam.web.soap.CsvRequiredFieldEmptyException
     */
    public CsvRequiredFieldEmptyException getFaultInfo() {
        return faultInfo;
    }

}
