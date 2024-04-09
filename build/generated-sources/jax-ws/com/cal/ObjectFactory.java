
package com.cal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cal package. 
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

    private final static QName _NotValidIcNumberException_QNAME = new QName("http://basicCalc.com/", "NotValidIcNumberException");
    private final static QName _Absi_QNAME = new QName("http://basicCalc.com/", "absi");
    private final static QName _AbsiResponse_QNAME = new QName("http://basicCalc.com/", "absiResponse");
    private final static QName _Age_QNAME = new QName("http://basicCalc.com/", "age");
    private final static QName _AgeResponse_QNAME = new QName("http://basicCalc.com/", "ageResponse");
    private final static QName _CalcBmi_QNAME = new QName("http://basicCalc.com/", "calc_bmi");
    private final static QName _CalcBmiResponse_QNAME = new QName("http://basicCalc.com/", "calc_bmiResponse");
    private final static QName _Cbr_QNAME = new QName("http://basicCalc.com/", "cbr");
    private final static QName _CbrResponse_QNAME = new QName("http://basicCalc.com/", "cbrResponse");
    private final static QName _GetBFPCalc_QNAME = new QName("http://basicCalc.com/", "getBFPCalc");
    private final static QName _GetBFPCalcResponse_QNAME = new QName("http://basicCalc.com/", "getBFPCalcResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotValidIcNumberException }
     * 
     */
    public NotValidIcNumberException createNotValidIcNumberException() {
        return new NotValidIcNumberException();
    }

    /**
     * Create an instance of {@link Absi }
     * 
     */
    public Absi createAbsi() {
        return new Absi();
    }

    /**
     * Create an instance of {@link AbsiResponse }
     * 
     */
    public AbsiResponse createAbsiResponse() {
        return new AbsiResponse();
    }

    /**
     * Create an instance of {@link Age }
     * 
     */
    public Age createAge() {
        return new Age();
    }

    /**
     * Create an instance of {@link AgeResponse }
     * 
     */
    public AgeResponse createAgeResponse() {
        return new AgeResponse();
    }

    /**
     * Create an instance of {@link CalcBmi }
     * 
     */
    public CalcBmi createCalcBmi() {
        return new CalcBmi();
    }

    /**
     * Create an instance of {@link CalcBmiResponse }
     * 
     */
    public CalcBmiResponse createCalcBmiResponse() {
        return new CalcBmiResponse();
    }

    /**
     * Create an instance of {@link Cbr }
     * 
     */
    public Cbr createCbr() {
        return new Cbr();
    }

    /**
     * Create an instance of {@link CbrResponse }
     * 
     */
    public CbrResponse createCbrResponse() {
        return new CbrResponse();
    }

    /**
     * Create an instance of {@link GetBFPCalc }
     * 
     */
    public GetBFPCalc createGetBFPCalc() {
        return new GetBFPCalc();
    }

    /**
     * Create an instance of {@link GetBFPCalcResponse }
     * 
     */
    public GetBFPCalcResponse createGetBFPCalcResponse() {
        return new GetBFPCalcResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotValidIcNumberException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotValidIcNumberException }{@code >}
     */
    @XmlElementDecl(namespace = "http://basicCalc.com/", name = "NotValidIcNumberException")
    public JAXBElement<NotValidIcNumberException> createNotValidIcNumberException(NotValidIcNumberException value) {
        return new JAXBElement<NotValidIcNumberException>(_NotValidIcNumberException_QNAME, NotValidIcNumberException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Absi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Absi }{@code >}
     */
    @XmlElementDecl(namespace = "http://basicCalc.com/", name = "absi")
    public JAXBElement<Absi> createAbsi(Absi value) {
        return new JAXBElement<Absi>(_Absi_QNAME, Absi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbsiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbsiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://basicCalc.com/", name = "absiResponse")
    public JAXBElement<AbsiResponse> createAbsiResponse(AbsiResponse value) {
        return new JAXBElement<AbsiResponse>(_AbsiResponse_QNAME, AbsiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Age }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Age }{@code >}
     */
    @XmlElementDecl(namespace = "http://basicCalc.com/", name = "age")
    public JAXBElement<Age> createAge(Age value) {
        return new JAXBElement<Age>(_Age_QNAME, Age.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://basicCalc.com/", name = "ageResponse")
    public JAXBElement<AgeResponse> createAgeResponse(AgeResponse value) {
        return new JAXBElement<AgeResponse>(_AgeResponse_QNAME, AgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcBmi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcBmi }{@code >}
     */
    @XmlElementDecl(namespace = "http://basicCalc.com/", name = "calc_bmi")
    public JAXBElement<CalcBmi> createCalcBmi(CalcBmi value) {
        return new JAXBElement<CalcBmi>(_CalcBmi_QNAME, CalcBmi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcBmiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcBmiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://basicCalc.com/", name = "calc_bmiResponse")
    public JAXBElement<CalcBmiResponse> createCalcBmiResponse(CalcBmiResponse value) {
        return new JAXBElement<CalcBmiResponse>(_CalcBmiResponse_QNAME, CalcBmiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cbr }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cbr }{@code >}
     */
    @XmlElementDecl(namespace = "http://basicCalc.com/", name = "cbr")
    public JAXBElement<Cbr> createCbr(Cbr value) {
        return new JAXBElement<Cbr>(_Cbr_QNAME, Cbr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CbrResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CbrResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://basicCalc.com/", name = "cbrResponse")
    public JAXBElement<CbrResponse> createCbrResponse(CbrResponse value) {
        return new JAXBElement<CbrResponse>(_CbrResponse_QNAME, CbrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBFPCalc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBFPCalc }{@code >}
     */
    @XmlElementDecl(namespace = "http://basicCalc.com/", name = "getBFPCalc")
    public JAXBElement<GetBFPCalc> createGetBFPCalc(GetBFPCalc value) {
        return new JAXBElement<GetBFPCalc>(_GetBFPCalc_QNAME, GetBFPCalc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBFPCalcResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBFPCalcResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://basicCalc.com/", name = "getBFPCalcResponse")
    public JAXBElement<GetBFPCalcResponse> createGetBFPCalcResponse(GetBFPCalcResponse value) {
        return new JAXBElement<GetBFPCalcResponse>(_GetBFPCalcResponse_QNAME, GetBFPCalcResponse.class, null, value);
    }

}
