
package bmicalculatorserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listIdBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listIdBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acc_id_user1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listIdBlock", propOrder = {
    "accIdUser1"
})
public class ListIdBlock {

    @XmlElement(name = "acc_id_user1")
    protected int accIdUser1;

    /**
     * Gets the value of the accIdUser1 property.
     * 
     */
    public int getAccIdUser1() {
        return accIdUser1;
    }

    /**
     * Sets the value of the accIdUser1 property.
     * 
     */
    public void setAccIdUser1(int value) {
        this.accIdUser1 = value;
    }

}
