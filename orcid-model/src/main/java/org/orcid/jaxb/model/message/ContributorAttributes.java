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
// Generated on: 2012.08.02 at 04:23:52 PM BST 
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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}contributor-sequence"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}contributor-role"/>
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
    "contributorSequence",
    "contributorRole"
})
@XmlRootElement(name = "contributor-attributes")
public class ContributorAttributes implements Serializable {

    @XmlElement(name = "contributor-sequence", required = true)
    protected SequenceType contributorSequence;
    @XmlElement(name = "contributor-role", required = true)
    protected ContributorRole contributorRole;

    /**
     * Gets the value of the contributorSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SequenceType getContributorSequence() {
        return contributorSequence;
    }

    /**
     * Sets the value of the contributorSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributorSequence(SequenceType value) {
        this.contributorSequence = value;
    }

    /**
     * Gets the value of the contributorRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ContributorRole getContributorRole() {
        return contributorRole;
    }

    /**
     * Sets the value of the contributorRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributorRole(ContributorRole value) {
        this.contributorRole = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContributorAttributes)) {
            return false;
        }

        ContributorAttributes that = (ContributorAttributes) o;

        if (contributorRole != that.contributorRole) {
            return false;
        }
        if (contributorSequence != that.contributorSequence) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = contributorSequence != null ? contributorSequence.hashCode() : 0;
        result = 31 * result + (contributorRole != null ? contributorRole.hashCode() : 0);
        return result;
    }
}
