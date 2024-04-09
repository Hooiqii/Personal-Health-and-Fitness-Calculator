
package com.cal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBFPCalc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBFPCalc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="waist" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="neck" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="hip" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBFPCalc", propOrder = {
    "height",
    "waist",
    "neck",
    "hip",
    "arg4"
})
public class GetBFPCalc {

    protected float height;
    protected float waist;
    protected float neck;
    protected float hip;
    protected String arg4;

    /**
     * Gets the value of the height property.
     * 
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(float value) {
        this.height = value;
    }

    /**
     * Gets the value of the waist property.
     * 
     */
    public float getWaist() {
        return waist;
    }

    /**
     * Sets the value of the waist property.
     * 
     */
    public void setWaist(float value) {
        this.waist = value;
    }

    /**
     * Gets the value of the neck property.
     * 
     */
    public float getNeck() {
        return neck;
    }

    /**
     * Sets the value of the neck property.
     * 
     */
    public void setNeck(float value) {
        this.neck = value;
    }

    /**
     * Gets the value of the hip property.
     * 
     */
    public float getHip() {
        return hip;
    }

    /**
     * Sets the value of the hip property.
     * 
     */
    public void setHip(float value) {
        this.hip = value;
    }

    /**
     * Gets the value of the arg4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg4() {
        return arg4;
    }

    /**
     * Sets the value of the arg4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg4(String value) {
        this.arg4 = value;
    }

}
