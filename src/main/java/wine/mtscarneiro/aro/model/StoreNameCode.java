package wine.mtscarneiro.aro.model;

public class StoreNameCode {

    private Long id;
    private String storeCode;

    public StoreNameCode() {
    }

    public StoreNameCode(Long id, String storeCode) {
        this.id = id;
        this.storeCode = storeCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }
}
