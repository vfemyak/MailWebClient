
package com.epam.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.web.soap package. 
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

    private final static QName _GetLetterByEmailResponse_QNAME = new QName("http://soap.web.epam.com/", "getLetterByEmailResponse");
    private final static QName _GetLetterBySubject_QNAME = new QName("http://soap.web.epam.com/", "getLetterBySubject");
    private final static QName _SendLetter_QNAME = new QName("http://soap.web.epam.com/", "sendLetter");
    private final static QName _CsvDataTypeMismatchException_QNAME = new QName("http://soap.web.epam.com/", "CsvDataTypeMismatchException");
    private final static QName _IOException_QNAME = new QName("http://soap.web.epam.com/", "IOException");
    private final static QName _CsvRequiredFieldEmptyException_QNAME = new QName("http://soap.web.epam.com/", "CsvRequiredFieldEmptyException");
    private final static QName _GetAllLetters_QNAME = new QName("http://soap.web.epam.com/", "getAllLetters");
    private final static QName _GetAllLettersResponse_QNAME = new QName("http://soap.web.epam.com/", "getAllLettersResponse");
    private final static QName _GetLetterByEmail_QNAME = new QName("http://soap.web.epam.com/", "getLetterByEmail");
    private final static QName _GetLetterBySubjectResponse_QNAME = new QName("http://soap.web.epam.com/", "getLetterBySubjectResponse");
    private final static QName _DeleteLetterBySubject_QNAME = new QName("http://soap.web.epam.com/", "deleteLetterBySubject");
    private final static QName _DeleteLetterBySubjectResponse_QNAME = new QName("http://soap.web.epam.com/", "deleteLetterBySubjectResponse");
    private final static QName _SendLetterResponse_QNAME = new QName("http://soap.web.epam.com/", "sendLetterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.web.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CsvRequiredFieldEmptyException }
     * 
     */
    public CsvRequiredFieldEmptyException createCsvRequiredFieldEmptyException() {
        return new CsvRequiredFieldEmptyException();
    }

    /**
     * Create an instance of {@link SendLetter }
     * 
     */
    public SendLetter createSendLetter() {
        return new SendLetter();
    }

    /**
     * Create an instance of {@link CsvDataTypeMismatchException }
     * 
     */
    public CsvDataTypeMismatchException createCsvDataTypeMismatchException() {
        return new CsvDataTypeMismatchException();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link GetLetterByEmailResponse }
     * 
     */
    public GetLetterByEmailResponse createGetLetterByEmailResponse() {
        return new GetLetterByEmailResponse();
    }

    /**
     * Create an instance of {@link GetLetterBySubject }
     * 
     */
    public GetLetterBySubject createGetLetterBySubject() {
        return new GetLetterBySubject();
    }

    /**
     * Create an instance of {@link DeleteLetterBySubject }
     * 
     */
    public DeleteLetterBySubject createDeleteLetterBySubject() {
        return new DeleteLetterBySubject();
    }

    /**
     * Create an instance of {@link DeleteLetterBySubjectResponse }
     * 
     */
    public DeleteLetterBySubjectResponse createDeleteLetterBySubjectResponse() {
        return new DeleteLetterBySubjectResponse();
    }

    /**
     * Create an instance of {@link SendLetterResponse }
     * 
     */
    public SendLetterResponse createSendLetterResponse() {
        return new SendLetterResponse();
    }

    /**
     * Create an instance of {@link GetAllLettersResponse }
     * 
     */
    public GetAllLettersResponse createGetAllLettersResponse() {
        return new GetAllLettersResponse();
    }

    /**
     * Create an instance of {@link GetLetterByEmail }
     * 
     */
    public GetLetterByEmail createGetLetterByEmail() {
        return new GetLetterByEmail();
    }

    /**
     * Create an instance of {@link GetLetterBySubjectResponse }
     * 
     */
    public GetLetterBySubjectResponse createGetLetterBySubjectResponse() {
        return new GetLetterBySubjectResponse();
    }

    /**
     * Create an instance of {@link GetAllLetters }
     * 
     */
    public GetAllLetters createGetAllLetters() {
        return new GetAllLetters();
    }

    /**
     * Create an instance of {@link Letter }
     * 
     */
    public Letter createLetter() {
        return new Letter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLetterByEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "getLetterByEmailResponse")
    public JAXBElement<GetLetterByEmailResponse> createGetLetterByEmailResponse(GetLetterByEmailResponse value) {
        return new JAXBElement<GetLetterByEmailResponse>(_GetLetterByEmailResponse_QNAME, GetLetterByEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLetterBySubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "getLetterBySubject")
    public JAXBElement<GetLetterBySubject> createGetLetterBySubject(GetLetterBySubject value) {
        return new JAXBElement<GetLetterBySubject>(_GetLetterBySubject_QNAME, GetLetterBySubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendLetter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "sendLetter")
    public JAXBElement<SendLetter> createSendLetter(SendLetter value) {
        return new JAXBElement<SendLetter>(_SendLetter_QNAME, SendLetter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CsvDataTypeMismatchException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "CsvDataTypeMismatchException")
    public JAXBElement<CsvDataTypeMismatchException> createCsvDataTypeMismatchException(CsvDataTypeMismatchException value) {
        return new JAXBElement<CsvDataTypeMismatchException>(_CsvDataTypeMismatchException_QNAME, CsvDataTypeMismatchException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CsvRequiredFieldEmptyException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "CsvRequiredFieldEmptyException")
    public JAXBElement<CsvRequiredFieldEmptyException> createCsvRequiredFieldEmptyException(CsvRequiredFieldEmptyException value) {
        return new JAXBElement<CsvRequiredFieldEmptyException>(_CsvRequiredFieldEmptyException_QNAME, CsvRequiredFieldEmptyException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLetters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "getAllLetters")
    public JAXBElement<GetAllLetters> createGetAllLetters(GetAllLetters value) {
        return new JAXBElement<GetAllLetters>(_GetAllLetters_QNAME, GetAllLetters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLettersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "getAllLettersResponse")
    public JAXBElement<GetAllLettersResponse> createGetAllLettersResponse(GetAllLettersResponse value) {
        return new JAXBElement<GetAllLettersResponse>(_GetAllLettersResponse_QNAME, GetAllLettersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLetterByEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "getLetterByEmail")
    public JAXBElement<GetLetterByEmail> createGetLetterByEmail(GetLetterByEmail value) {
        return new JAXBElement<GetLetterByEmail>(_GetLetterByEmail_QNAME, GetLetterByEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLetterBySubjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "getLetterBySubjectResponse")
    public JAXBElement<GetLetterBySubjectResponse> createGetLetterBySubjectResponse(GetLetterBySubjectResponse value) {
        return new JAXBElement<GetLetterBySubjectResponse>(_GetLetterBySubjectResponse_QNAME, GetLetterBySubjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLetterBySubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "deleteLetterBySubject")
    public JAXBElement<DeleteLetterBySubject> createDeleteLetterBySubject(DeleteLetterBySubject value) {
        return new JAXBElement<DeleteLetterBySubject>(_DeleteLetterBySubject_QNAME, DeleteLetterBySubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLetterBySubjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "deleteLetterBySubjectResponse")
    public JAXBElement<DeleteLetterBySubjectResponse> createDeleteLetterBySubjectResponse(DeleteLetterBySubjectResponse value) {
        return new JAXBElement<DeleteLetterBySubjectResponse>(_DeleteLetterBySubjectResponse_QNAME, DeleteLetterBySubjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendLetterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "sendLetterResponse")
    public JAXBElement<SendLetterResponse> createSendLetterResponse(SendLetterResponse value) {
        return new JAXBElement<SendLetterResponse>(_SendLetterResponse_QNAME, SendLetterResponse.class, null, value);
    }

}
