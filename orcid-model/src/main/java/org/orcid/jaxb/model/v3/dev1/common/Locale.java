//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.18 at 10:32:14 AM GMT 
//

package org.orcid.jaxb.model.v3.dev1.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * <p/>
 * Java class for visibility.
 * <p/>
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <p/>
 * 
 * <pre>
 * &lt;simpleType name="locale">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="en"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="zh_TW"/>
 *     &lt;enumeration value="zh_CN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "locale")
@XmlEnum
public enum Locale implements Serializable {
    @XmlEnumValue("ar")
    AR("ar"),
    
    @XmlEnumValue("en")
    EN("en"),

    @XmlEnumValue("es")
    ES("es"),

    @XmlEnumValue("fr")
    FR("fr"),

    @XmlEnumValue("ko")
    KO("ko"),

    @XmlEnumValue("pt")
    PT("pt"),

    @XmlEnumValue("ru")
    RU("ru"),

    @XmlEnumValue("zh_CN")
    ZH_CN("zh_CN"),

    @XmlEnumValue("zh_TW")
    ZH_TW("zh_TW"),

    @XmlEnumValue("it")
    IT("it"),
    
    @XmlEnumValue("ja")
    JA("ja"), 
    
    @XmlEnumValue("xx")
    XX("xx");
    
    private final String value;

    Locale(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @JsonValue
    public String jsonValue() {
        return this.name();
    }
    
    public static Locale fromValue(String v) {
        for (Locale c : Locale.values()) {
            if (v.startsWith(c.value)) {
                return c;
            }
        }
        // if we don't support the specified language return english
        return Locale.EN;
    }

    @Override
    public String toString() {
        return value;
    }

}
