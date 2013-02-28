/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2013 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.13 at 04:58:08 PM BST 
//


package org.orcid.jaxb.model.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}grant-external-program" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}grant-external-id" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "grantExternalProgram",
    "grantExternalId"
})
@XmlRootElement(name = "grant-external-identifier")
public class GrantExternalIdentifier implements Serializable {

    @XmlElement(name = "grant-external-program")
    protected GrantExternalProgram grantExternalProgram;
    @XmlElement(name = "grant-external-id")
    protected GrantExternalId grantExternalId;

    /**
     * Gets the value of the grantExternalProgram property.
     * 
     * @return
     *     possible object is
     *     {@link GrantExternalProgram }
     *     
     */
    public GrantExternalProgram getGrantExternalProgram() {
        return grantExternalProgram;
    }

    /**
     * Sets the value of the grantExternalProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantExternalProgram }
     *     
     */
    public void setGrantExternalProgram(GrantExternalProgram value) {
        this.grantExternalProgram = value;
    }

    /**
     * Gets the value of the grantExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link GrantExternalId }
     *     
     */
    public GrantExternalId getGrantExternalId() {
        return grantExternalId;
    }

    /**
     * Sets the value of the grantExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantExternalId }
     *     
     */
    public void setGrantExternalId(GrantExternalId value) {
        this.grantExternalId = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GrantExternalIdentifier)) {
            return false;
        }

        GrantExternalIdentifier that = (GrantExternalIdentifier) o;

        if (grantExternalId != null ? !grantExternalId.equals(that.grantExternalId) : that.grantExternalId != null) {
            return false;
        }
        if (grantExternalProgram != null ? !grantExternalProgram.equals(that.grantExternalProgram) : that.grantExternalProgram != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = grantExternalProgram != null ? grantExternalProgram.hashCode() : 0;
        result = 31 * result + (grantExternalId != null ? grantExternalId.hashCode() : 0);
        return result;
    }
}
