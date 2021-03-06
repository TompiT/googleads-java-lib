
package com.google.api.ads.dfp.jaxws.v201211;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code ReportQuery} object allows you to specify the selection criteria for
 *             generating a report.
 *           
 * 
 * <p>Java class for ReportQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dimensions" type="{https://www.google.com/apis/ads/publisher/v201211}Dimension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adUnitView" type="{https://www.google.com/apis/ads/publisher/v201211}ReportQuery.AdUnitView" minOccurs="0"/>
 *         &lt;element name="columns" type="{https://www.google.com/apis/ads/publisher/v201211}Column" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dimensionAttributes" type="{https://www.google.com/apis/ads/publisher/v201211}DimensionAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customFieldIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startDate" type="{https://www.google.com/apis/ads/publisher/v201211}Date" minOccurs="0"/>
 *         &lt;element name="endDate" type="{https://www.google.com/apis/ads/publisher/v201211}Date" minOccurs="0"/>
 *         &lt;element name="dateRangeType" type="{https://www.google.com/apis/ads/publisher/v201211}DateRangeType" minOccurs="0"/>
 *         &lt;element name="dimensionFilters" type="{https://www.google.com/apis/ads/publisher/v201211}DimensionFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statement" type="{https://www.google.com/apis/ads/publisher/v201211}Statement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportQuery", propOrder = {
    "dimensions",
    "adUnitView",
    "columns",
    "dimensionAttributes",
    "customFieldIds",
    "startDate",
    "endDate",
    "dateRangeType",
    "dimensionFilters",
    "statement"
})
public class ReportQuery {

    protected List<Dimension> dimensions;
    protected ReportQueryAdUnitView adUnitView;
    protected List<Column> columns;
    protected List<DimensionAttribute> dimensionAttributes;
    @XmlElement(type = Long.class)
    protected List<Long> customFieldIds;
    protected Date startDate;
    protected Date endDate;
    protected DateRangeType dateRangeType;
    protected List<DimensionFilter> dimensionFilters;
    protected Statement statement;

    /**
     * Gets the value of the dimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dimension }
     * 
     * 
     */
    public List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new ArrayList<Dimension>();
        }
        return this.dimensions;
    }

    /**
     * Gets the value of the adUnitView property.
     * 
     * @return
     *     possible object is
     *     {@link ReportQueryAdUnitView }
     *     
     */
    public ReportQueryAdUnitView getAdUnitView() {
        return adUnitView;
    }

    /**
     * Sets the value of the adUnitView property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportQueryAdUnitView }
     *     
     */
    public void setAdUnitView(ReportQueryAdUnitView value) {
        this.adUnitView = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Column }
     * 
     * 
     */
    public List<Column> getColumns() {
        if (columns == null) {
            columns = new ArrayList<Column>();
        }
        return this.columns;
    }

    /**
     * Gets the value of the dimensionAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensionAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensionAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionAttribute }
     * 
     * 
     */
    public List<DimensionAttribute> getDimensionAttributes() {
        if (dimensionAttributes == null) {
            dimensionAttributes = new ArrayList<DimensionAttribute>();
        }
        return this.dimensionAttributes;
    }

    /**
     * Gets the value of the customFieldIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customFieldIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomFieldIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCustomFieldIds() {
        if (customFieldIds == null) {
            customFieldIds = new ArrayList<Long>();
        }
        return this.customFieldIds;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the dateRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeType }
     *     
     */
    public DateRangeType getDateRangeType() {
        return dateRangeType;
    }

    /**
     * Sets the value of the dateRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeType }
     *     
     */
    public void setDateRangeType(DateRangeType value) {
        this.dateRangeType = value;
    }

    /**
     * Gets the value of the dimensionFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensionFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensionFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionFilter }
     * 
     * 
     */
    public List<DimensionFilter> getDimensionFilters() {
        if (dimensionFilters == null) {
            dimensionFilters = new ArrayList<DimensionFilter>();
        }
        return this.dimensionFilters;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setStatement(Statement value) {
        this.statement = value;
    }

}
