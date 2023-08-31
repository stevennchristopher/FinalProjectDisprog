
package bmicalculatorserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertDataIdeal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertDataIdeal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tinggi_badan" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="berat_ideal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
@XmlType(name = "insertDataIdeal", propOrder = {
    "tinggiBadan",
    "beratIdeal",
    "accountId"
})
public class InsertDataIdeal {

    @XmlElement(name = "tinggi_badan")
    protected double tinggiBadan;
    @XmlElement(name = "berat_ideal")
    protected double beratIdeal;
    @XmlElement(name = "account_id")
    protected int accountId;

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
     * Gets the value of the beratIdeal property.
     * 
     */
    public double getBeratIdeal() {
        return beratIdeal;
    }

    /**
     * Sets the value of the beratIdeal property.
     * 
     */
    public void setBeratIdeal(double value) {
        this.beratIdeal = value;
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
