
package bmicalculatorserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertDataBMI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertDataBMI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="berat_badan" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tinggi_badan" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="hasil_bmi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="account_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertDataBMI", propOrder = {
    "beratBadan",
    "tinggiBadan",
    "hasilBmi",
    "accountId"
})
public class InsertDataBMI {

    @XmlElement(name = "berat_badan")
    protected double beratBadan;
    @XmlElement(name = "tinggi_badan")
    protected double tinggiBadan;
    @XmlElement(name = "hasil_bmi")
    protected double hasilBmi;
    @XmlElement(name = "account_id")
    protected int accountId;

    /**
     * Gets the value of the beratBadan property.
     * 
     */
    public double getBeratBadan() {
        return beratBadan;
    }

    /**
     * Sets the value of the beratBadan property.
     * 
     */
    public void setBeratBadan(double value) {
        this.beratBadan = value;
    }

    /**
     * Gets the value of the tinggiBadan property.
     * 
     */
    public double getTinggiBadan() {
        return tinggiBadan;
    }

    /**
     * Sets the value of the tinggiBadan property.
     * 
     */
    public void setTinggiBadan(double value) {
        this.tinggiBadan = value;
    }

    /**
     * Gets the value of the hasilBmi property.
     * 
     */
    public double getHasilBmi() {
        return hasilBmi;
    }

    /**
     * Sets the value of the hasilBmi property.
     * 
     */
    public void setHasilBmi(double value) {
        this.hasilBmi = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(int value) {
        this.accountId = value;
    }

}
