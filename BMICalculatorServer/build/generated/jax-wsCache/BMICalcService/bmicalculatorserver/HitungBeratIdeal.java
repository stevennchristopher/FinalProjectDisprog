
package bmicalculatorserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hitungBeratIdeal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hitungBeratIdeal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tinggi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="acc_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hitungBeratIdeal", propOrder = {
    "tinggi",
    "accId"
})
public class HitungBeratIdeal {

    protected double tinggi;
    @XmlElement(name = "acc_id")
    protected int accId;

    /**
     * Gets the value of the tinggi property.
     * 
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * Sets the value of the tinggi property.
     * 
     */
    public void setTinggi(double value) {
        this.tinggi = value;
    }

    /**
     * Gets the value of the accId property.
     * 
     */
    public int getAccId() {
        return accId;
    }

    /**
     * Sets the value of the accId property.
     * 
     */
    public void setAccId(int value) {
        this.accId = value;
    }

}
