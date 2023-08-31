
package bmicalculatorserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hitungBMI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hitungBMI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tinggi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="berat" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hitungBMI", propOrder = {
    "tinggi",
    "berat"
})
public class HitungBMI {

    protected double tinggi;
    protected double berat;

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
     * Gets the value of the berat property.
     * 
     */
    public double getBerat() {
        return berat;
    }

    /**
     * Sets the value of the berat property.
     * 
     */
    public void setBerat(double value) {
        this.berat = value;
    }

}
