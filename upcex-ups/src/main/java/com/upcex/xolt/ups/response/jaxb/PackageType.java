//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.27 at 05:13:48 PM EST 
//


package com.upcex.xolt.ups.response.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RescheduledDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RescheduledDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Redirect" type="{}RedirectType" minOccurs="0"/&gt;
 *         &lt;element name="Reroute" type="{}ReRouteType" minOccurs="0"/&gt;
 *         &lt;element name="ReturnTo" type="{}ReturnToType" minOccurs="0"/&gt;
 *         &lt;element name="PackageServiceOptions" type="{}PackageServiceOptionsType" minOccurs="0"/&gt;
 *         &lt;element ref="{}Activity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PackageWeight" type="{}WeightType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNumber" type="{}ReferenceNumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductType" type="{}ProductCodeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="LocationAssured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlternateTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AlternateTrackingInfo" type="{}AlternateTrackingInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Accessorial" type="{}AccessorialCodeDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DimensionalWeightScanIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType", propOrder = {
    "trackingNumber",
    "rescheduledDeliveryDate",
    "rescheduledDeliveryTime",
    "redirect",
    "reroute",
    "returnTo",
    "packageServiceOptions",
    "activity",
    "message",
    "packageWeight",
    "referenceNumber",
    "productType",
    "locationAssured",
    "alternateTrackingNumber",
    "alternateTrackingInfo",
    "accessorial",
    "dimensionalWeightScanIndicator"
})
public class PackageType {

    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "RescheduledDeliveryDate")
    protected String rescheduledDeliveryDate;
    @XmlElement(name = "RescheduledDeliveryTime")
    protected String rescheduledDeliveryTime;
    @XmlElement(name = "Redirect")
    protected RedirectType redirect;
    @XmlElement(name = "Reroute")
    protected ReRouteType reroute;
    @XmlElement(name = "ReturnTo")
    protected ReturnToType returnTo;
    @XmlElement(name = "PackageServiceOptions")
    protected PackageServiceOptionsType packageServiceOptions;
    @XmlElement(name = "Activity")
    protected List<Activity> activity;
    @XmlElement(name = "Message")
    protected List<CodeType> message;
    @XmlElement(name = "PackageWeight")
    protected WeightType packageWeight;
    @XmlElement(name = "ReferenceNumber")
    protected List<ReferenceNumberType> referenceNumber;
    @XmlElement(name = "ProductType")
    protected ProductCodeDescriptionType productType;
    @XmlElement(name = "LocationAssured")
    protected String locationAssured;
    @XmlElement(name = "AlternateTrackingNumber")
    protected List<String> alternateTrackingNumber;
    @XmlElement(name = "AlternateTrackingInfo")
    protected List<AlternateTrackingInfoType> alternateTrackingInfo;
    @XmlElement(name = "Accessorial")
    protected List<AccessorialCodeDescriptionType> accessorial;
    @XmlElement(name = "DimensionalWeightScanIndicator")
    protected String dimensionalWeightScanIndicator;

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the rescheduledDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRescheduledDeliveryDate() {
        return rescheduledDeliveryDate;
    }

    /**
     * Sets the value of the rescheduledDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRescheduledDeliveryDate(String value) {
        this.rescheduledDeliveryDate = value;
    }

    /**
     * Gets the value of the rescheduledDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRescheduledDeliveryTime() {
        return rescheduledDeliveryTime;
    }

    /**
     * Sets the value of the rescheduledDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRescheduledDeliveryTime(String value) {
        this.rescheduledDeliveryTime = value;
    }

    /**
     * Gets the value of the redirect property.
     * 
     * @return
     *     possible object is
     *     {@link RedirectType }
     *     
     */
    public RedirectType getRedirect() {
        return redirect;
    }

    /**
     * Sets the value of the redirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectType }
     *     
     */
    public void setRedirect(RedirectType value) {
        this.redirect = value;
    }

    /**
     * Gets the value of the reroute property.
     * 
     * @return
     *     possible object is
     *     {@link ReRouteType }
     *     
     */
    public ReRouteType getReroute() {
        return reroute;
    }

    /**
     * Sets the value of the reroute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReRouteType }
     *     
     */
    public void setReroute(ReRouteType value) {
        this.reroute = value;
    }

    /**
     * Gets the value of the returnTo property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnToType }
     *     
     */
    public ReturnToType getReturnTo() {
        return returnTo;
    }

    /**
     * Sets the value of the returnTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnToType }
     *     
     */
    public void setReturnTo(ReturnToType value) {
        this.returnTo = value;
    }

    /**
     * Gets the value of the packageServiceOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PackageServiceOptionsType }
     *     
     */
    public PackageServiceOptionsType getPackageServiceOptions() {
        return packageServiceOptions;
    }

    /**
     * Sets the value of the packageServiceOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsType }
     *     
     */
    public void setPackageServiceOptions(PackageServiceOptionsType value) {
        this.packageServiceOptions = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activity }
     * 
     * 
     */
    public List<Activity> getActivity() {
        if (activity == null) {
            activity = new ArrayList<Activity>();
        }
        return this.activity;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getMessage() {
        if (message == null) {
            message = new ArrayList<CodeType>();
        }
        return this.message;
    }

    /**
     * Gets the value of the packageWeight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    public WeightType getPackageWeight() {
        return packageWeight;
    }

    /**
     * Sets the value of the packageWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setPackageWeight(WeightType value) {
        this.packageWeight = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceNumberType }
     * 
     * 
     */
    public List<ReferenceNumberType> getReferenceNumber() {
        if (referenceNumber == null) {
            referenceNumber = new ArrayList<ReferenceNumberType>();
        }
        return this.referenceNumber;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCodeDescriptionType }
     *     
     */
    public ProductCodeDescriptionType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCodeDescriptionType }
     *     
     */
    public void setProductType(ProductCodeDescriptionType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the locationAssured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAssured() {
        return locationAssured;
    }

    /**
     * Sets the value of the locationAssured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAssured(String value) {
        this.locationAssured = value;
    }

    /**
     * Gets the value of the alternateTrackingNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateTrackingNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateTrackingNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternateTrackingNumber() {
        if (alternateTrackingNumber == null) {
            alternateTrackingNumber = new ArrayList<String>();
        }
        return this.alternateTrackingNumber;
    }

    /**
     * Gets the value of the alternateTrackingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateTrackingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateTrackingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateTrackingInfoType }
     * 
     * 
     */
    public List<AlternateTrackingInfoType> getAlternateTrackingInfo() {
        if (alternateTrackingInfo == null) {
            alternateTrackingInfo = new ArrayList<AlternateTrackingInfoType>();
        }
        return this.alternateTrackingInfo;
    }

    /**
     * Gets the value of the accessorial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessorial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessorial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessorialCodeDescriptionType }
     * 
     * 
     */
    public List<AccessorialCodeDescriptionType> getAccessorial() {
        if (accessorial == null) {
            accessorial = new ArrayList<AccessorialCodeDescriptionType>();
        }
        return this.accessorial;
    }

    /**
     * Gets the value of the dimensionalWeightScanIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionalWeightScanIndicator() {
        return dimensionalWeightScanIndicator;
    }

    /**
     * Sets the value of the dimensionalWeightScanIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionalWeightScanIndicator(String value) {
        this.dimensionalWeightScanIndicator = value;
    }

}
