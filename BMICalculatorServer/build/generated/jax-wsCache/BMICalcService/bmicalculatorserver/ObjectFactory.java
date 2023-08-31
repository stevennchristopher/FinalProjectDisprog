
package bmicalculatorserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bmicalculatorserver package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BlockAccount_QNAME = new QName("http://services.bmicalc.com/", "blockAccount");
    private final static QName _BlockAccountResponse_QNAME = new QName("http://services.bmicalc.com/", "blockAccountResponse");
    private final static QName _CekLogin_QNAME = new QName("http://services.bmicalc.com/", "cekLogin");
    private final static QName _CekLoginResponse_QNAME = new QName("http://services.bmicalc.com/", "cekLoginResponse");
    private final static QName _DataToString_QNAME = new QName("http://services.bmicalc.com/", "dataToString");
    private final static QName _DataToStringResponse_QNAME = new QName("http://services.bmicalc.com/", "dataToStringResponse");
    private final static QName _DataUntukGrafik_QNAME = new QName("http://services.bmicalc.com/", "dataUntukGrafik");
    private final static QName _DataUntukGrafikResponse_QNAME = new QName("http://services.bmicalc.com/", "dataUntukGrafikResponse");
    private final static QName _HitungBMI_QNAME = new QName("http://services.bmicalc.com/", "hitungBMI");
    private final static QName _HitungBMIResponse_QNAME = new QName("http://services.bmicalc.com/", "hitungBMIResponse");
    private final static QName _HitungBeratIdeal_QNAME = new QName("http://services.bmicalc.com/", "hitungBeratIdeal");
    private final static QName _HitungBeratIdealResponse_QNAME = new QName("http://services.bmicalc.com/", "hitungBeratIdealResponse");
    private final static QName _InsertAccount_QNAME = new QName("http://services.bmicalc.com/", "insertAccount");
    private final static QName _InsertAccountResponse_QNAME = new QName("http://services.bmicalc.com/", "insertAccountResponse");
    private final static QName _InsertDataBMI_QNAME = new QName("http://services.bmicalc.com/", "insertDataBMI");
    private final static QName _InsertDataBMIResponse_QNAME = new QName("http://services.bmicalc.com/", "insertDataBMIResponse");
    private final static QName _InsertDataIdeal_QNAME = new QName("http://services.bmicalc.com/", "insertDataIdeal");
    private final static QName _InsertDataIdealResponse_QNAME = new QName("http://services.bmicalc.com/", "insertDataIdealResponse");
    private final static QName _ListIdBlock_QNAME = new QName("http://services.bmicalc.com/", "listIdBlock");
    private final static QName _ListIdBlockResponse_QNAME = new QName("http://services.bmicalc.com/", "listIdBlockResponse");
    private final static QName _ViewListHistoryBMI_QNAME = new QName("http://services.bmicalc.com/", "viewListHistoryBMI");
    private final static QName _ViewListHistoryBMIResponse_QNAME = new QName("http://services.bmicalc.com/", "viewListHistoryBMIResponse");
    private final static QName _ViewListHistoryIdeal_QNAME = new QName("http://services.bmicalc.com/", "viewListHistoryIdeal");
    private final static QName _ViewListHistoryIdealResponse_QNAME = new QName("http://services.bmicalc.com/", "viewListHistoryIdealResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bmicalculatorserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BlockAccount }
     * 
     */
    public BlockAccount createBlockAccount() {
        return new BlockAccount();
    }

    /**
     * Create an instance of {@link BlockAccountResponse }
     * 
     */
    public BlockAccountResponse createBlockAccountResponse() {
        return new BlockAccountResponse();
    }

    /**
     * Create an instance of {@link CekLogin }
     * 
     */
    public CekLogin createCekLogin() {
        return new CekLogin();
    }

    /**
     * Create an instance of {@link CekLoginResponse }
     * 
     */
    public CekLoginResponse createCekLoginResponse() {
        return new CekLoginResponse();
    }

    /**
     * Create an instance of {@link DataToString }
     * 
     */
    public DataToString createDataToString() {
        return new DataToString();
    }

    /**
     * Create an instance of {@link DataToStringResponse }
     * 
     */
    public DataToStringResponse createDataToStringResponse() {
        return new DataToStringResponse();
    }

    /**
     * Create an instance of {@link DataUntukGrafik }
     * 
     */
    public DataUntukGrafik createDataUntukGrafik() {
        return new DataUntukGrafik();
    }

    /**
     * Create an instance of {@link DataUntukGrafikResponse }
     * 
     */
    public DataUntukGrafikResponse createDataUntukGrafikResponse() {
        return new DataUntukGrafikResponse();
    }

    /**
     * Create an instance of {@link HitungBMI }
     * 
     */
    public HitungBMI createHitungBMI() {
        return new HitungBMI();
    }

    /**
     * Create an instance of {@link HitungBMIResponse }
     * 
     */
    public HitungBMIResponse createHitungBMIResponse() {
        return new HitungBMIResponse();
    }

    /**
     * Create an instance of {@link HitungBeratIdeal }
     * 
     */
    public HitungBeratIdeal createHitungBeratIdeal() {
        return new HitungBeratIdeal();
    }

    /**
     * Create an instance of {@link HitungBeratIdealResponse }
     * 
     */
    public HitungBeratIdealResponse createHitungBeratIdealResponse() {
        return new HitungBeratIdealResponse();
    }

    /**
     * Create an instance of {@link InsertAccount }
     * 
     */
    public InsertAccount createInsertAccount() {
        return new InsertAccount();
    }

    /**
     * Create an instance of {@link InsertAccountResponse }
     * 
     */
    public InsertAccountResponse createInsertAccountResponse() {
        return new InsertAccountResponse();
    }

    /**
     * Create an instance of {@link InsertDataBMI }
     * 
     */
    public InsertDataBMI createInsertDataBMI() {
        return new InsertDataBMI();
    }

    /**
     * Create an instance of {@link InsertDataBMIResponse }
     * 
     */
    public InsertDataBMIResponse createInsertDataBMIResponse() {
        return new InsertDataBMIResponse();
    }

    /**
     * Create an instance of {@link InsertDataIdeal }
     * 
     */
    public InsertDataIdeal createInsertDataIdeal() {
        return new InsertDataIdeal();
    }

    /**
     * Create an instance of {@link InsertDataIdealResponse }
     * 
     */
    public InsertDataIdealResponse createInsertDataIdealResponse() {
        return new InsertDataIdealResponse();
    }

    /**
     * Create an instance of {@link ListIdBlock }
     * 
     */
    public ListIdBlock createListIdBlock() {
        return new ListIdBlock();
    }

    /**
     * Create an instance of {@link ListIdBlockResponse }
     * 
     */
    public ListIdBlockResponse createListIdBlockResponse() {
        return new ListIdBlockResponse();
    }

    /**
     * Create an instance of {@link ViewListHistoryBMI }
     * 
     */
    public ViewListHistoryBMI createViewListHistoryBMI() {
        return new ViewListHistoryBMI();
    }

    /**
     * Create an instance of {@link ViewListHistoryBMIResponse }
     * 
     */
    public ViewListHistoryBMIResponse createViewListHistoryBMIResponse() {
        return new ViewListHistoryBMIResponse();
    }

    /**
     * Create an instance of {@link ViewListHistoryIdeal }
     * 
     */
    public ViewListHistoryIdeal createViewListHistoryIdeal() {
        return new ViewListHistoryIdeal();
    }

    /**
     * Create an instance of {@link ViewListHistoryIdealResponse }
     * 
     */
    public ViewListHistoryIdealResponse createViewListHistoryIdealResponse() {
        return new ViewListHistoryIdealResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlockAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "blockAccount")
    public JAXBElement<BlockAccount> createBlockAccount(BlockAccount value) {
        return new JAXBElement<BlockAccount>(_BlockAccount_QNAME, BlockAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlockAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "blockAccountResponse")
    public JAXBElement<BlockAccountResponse> createBlockAccountResponse(BlockAccountResponse value) {
        return new JAXBElement<BlockAccountResponse>(_BlockAccountResponse_QNAME, BlockAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekLogin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CekLogin }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "cekLogin")
    public JAXBElement<CekLogin> createCekLogin(CekLogin value) {
        return new JAXBElement<CekLogin>(_CekLogin_QNAME, CekLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekLoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CekLoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "cekLoginResponse")
    public JAXBElement<CekLoginResponse> createCekLoginResponse(CekLoginResponse value) {
        return new JAXBElement<CekLoginResponse>(_CekLoginResponse_QNAME, CekLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataToString }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataToString }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "dataToString")
    public JAXBElement<DataToString> createDataToString(DataToString value) {
        return new JAXBElement<DataToString>(_DataToString_QNAME, DataToString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataToStringResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataToStringResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "dataToStringResponse")
    public JAXBElement<DataToStringResponse> createDataToStringResponse(DataToStringResponse value) {
        return new JAXBElement<DataToStringResponse>(_DataToStringResponse_QNAME, DataToStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataUntukGrafik }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataUntukGrafik }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "dataUntukGrafik")
    public JAXBElement<DataUntukGrafik> createDataUntukGrafik(DataUntukGrafik value) {
        return new JAXBElement<DataUntukGrafik>(_DataUntukGrafik_QNAME, DataUntukGrafik.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataUntukGrafikResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataUntukGrafikResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "dataUntukGrafikResponse")
    public JAXBElement<DataUntukGrafikResponse> createDataUntukGrafikResponse(DataUntukGrafikResponse value) {
        return new JAXBElement<DataUntukGrafikResponse>(_DataUntukGrafikResponse_QNAME, DataUntukGrafikResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HitungBMI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HitungBMI }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "hitungBMI")
    public JAXBElement<HitungBMI> createHitungBMI(HitungBMI value) {
        return new JAXBElement<HitungBMI>(_HitungBMI_QNAME, HitungBMI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HitungBMIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HitungBMIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "hitungBMIResponse")
    public JAXBElement<HitungBMIResponse> createHitungBMIResponse(HitungBMIResponse value) {
        return new JAXBElement<HitungBMIResponse>(_HitungBMIResponse_QNAME, HitungBMIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HitungBeratIdeal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HitungBeratIdeal }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "hitungBeratIdeal")
    public JAXBElement<HitungBeratIdeal> createHitungBeratIdeal(HitungBeratIdeal value) {
        return new JAXBElement<HitungBeratIdeal>(_HitungBeratIdeal_QNAME, HitungBeratIdeal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HitungBeratIdealResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HitungBeratIdealResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "hitungBeratIdealResponse")
    public JAXBElement<HitungBeratIdealResponse> createHitungBeratIdealResponse(HitungBeratIdealResponse value) {
        return new JAXBElement<HitungBeratIdealResponse>(_HitungBeratIdealResponse_QNAME, HitungBeratIdealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "insertAccount")
    public JAXBElement<InsertAccount> createInsertAccount(InsertAccount value) {
        return new JAXBElement<InsertAccount>(_InsertAccount_QNAME, InsertAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "insertAccountResponse")
    public JAXBElement<InsertAccountResponse> createInsertAccountResponse(InsertAccountResponse value) {
        return new JAXBElement<InsertAccountResponse>(_InsertAccountResponse_QNAME, InsertAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDataBMI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertDataBMI }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "insertDataBMI")
    public JAXBElement<InsertDataBMI> createInsertDataBMI(InsertDataBMI value) {
        return new JAXBElement<InsertDataBMI>(_InsertDataBMI_QNAME, InsertDataBMI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDataBMIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertDataBMIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "insertDataBMIResponse")
    public JAXBElement<InsertDataBMIResponse> createInsertDataBMIResponse(InsertDataBMIResponse value) {
        return new JAXBElement<InsertDataBMIResponse>(_InsertDataBMIResponse_QNAME, InsertDataBMIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDataIdeal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertDataIdeal }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "insertDataIdeal")
    public JAXBElement<InsertDataIdeal> createInsertDataIdeal(InsertDataIdeal value) {
        return new JAXBElement<InsertDataIdeal>(_InsertDataIdeal_QNAME, InsertDataIdeal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDataIdealResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertDataIdealResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "insertDataIdealResponse")
    public JAXBElement<InsertDataIdealResponse> createInsertDataIdealResponse(InsertDataIdealResponse value) {
        return new JAXBElement<InsertDataIdealResponse>(_InsertDataIdealResponse_QNAME, InsertDataIdealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListIdBlock }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListIdBlock }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "listIdBlock")
    public JAXBElement<ListIdBlock> createListIdBlock(ListIdBlock value) {
        return new JAXBElement<ListIdBlock>(_ListIdBlock_QNAME, ListIdBlock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListIdBlockResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListIdBlockResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "listIdBlockResponse")
    public JAXBElement<ListIdBlockResponse> createListIdBlockResponse(ListIdBlockResponse value) {
        return new JAXBElement<ListIdBlockResponse>(_ListIdBlockResponse_QNAME, ListIdBlockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewListHistoryBMI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViewListHistoryBMI }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "viewListHistoryBMI")
    public JAXBElement<ViewListHistoryBMI> createViewListHistoryBMI(ViewListHistoryBMI value) {
        return new JAXBElement<ViewListHistoryBMI>(_ViewListHistoryBMI_QNAME, ViewListHistoryBMI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewListHistoryBMIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViewListHistoryBMIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "viewListHistoryBMIResponse")
    public JAXBElement<ViewListHistoryBMIResponse> createViewListHistoryBMIResponse(ViewListHistoryBMIResponse value) {
        return new JAXBElement<ViewListHistoryBMIResponse>(_ViewListHistoryBMIResponse_QNAME, ViewListHistoryBMIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewListHistoryIdeal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViewListHistoryIdeal }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "viewListHistoryIdeal")
    public JAXBElement<ViewListHistoryIdeal> createViewListHistoryIdeal(ViewListHistoryIdeal value) {
        return new JAXBElement<ViewListHistoryIdeal>(_ViewListHistoryIdeal_QNAME, ViewListHistoryIdeal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewListHistoryIdealResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViewListHistoryIdealResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.bmicalc.com/", name = "viewListHistoryIdealResponse")
    public JAXBElement<ViewListHistoryIdealResponse> createViewListHistoryIdealResponse(ViewListHistoryIdealResponse value) {
        return new JAXBElement<ViewListHistoryIdealResponse>(_ViewListHistoryIdealResponse_QNAME, ViewListHistoryIdealResponse.class, null, value);
    }

}
