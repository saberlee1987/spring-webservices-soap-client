//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.03 at 06:03:18 PM IRDT 
//


package com.saber.springwebservices.soap.client.dto.wsdl;

import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.ToNumberPolicy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPersonResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPersonResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddPersonResponseDto" type="{http://com.saber.spring_camel_cxf_soap_provider.soap.services/}AddPersonResponseDto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPersonResponse", namespace = "http://services.soap.spring_camel_cxf_soap_provider.saber.com/", propOrder = {
    "addPersonResponseDto"
})
public class AddPersonResponse {

    @XmlElement(name = "AddPersonResponseDto")
    protected AddPersonResponseDto addPersonResponseDto;

    /**
     * Gets the value of the addPersonResponseDto property.
     * 
     * @return
     *     possible object is
     *     {@link AddPersonResponseDto }
     *     
     */
    public AddPersonResponseDto getAddPersonResponseDto() {
        return addPersonResponseDto;
    }

    /**
     * Sets the value of the addPersonResponseDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddPersonResponseDto }
     *     
     */
    public void setAddPersonResponseDto(AddPersonResponseDto value) {
        this.addPersonResponseDto = value;
    }
    @Override
    public String toString() {
        return new GsonBuilder()
                .setLenient()
                .setPrettyPrinting()
                .enableComplexMapKeySerialization()
                .setLongSerializationPolicy(LongSerializationPolicy.DEFAULT)
                .setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE)
                .create().toJson(this, AddPersonResponse.class);
    }
}
