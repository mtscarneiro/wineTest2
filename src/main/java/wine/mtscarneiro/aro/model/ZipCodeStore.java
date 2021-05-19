package wine.mtscarneiro.aro.model;

import java.util.List;

public class ZipCodeStore {

    private Long id;

    private Integer startZip;
    private Integer endZip;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStartZip() {
        return startZip;
    }

    public void setStartZip(Integer startZip) {
        this.startZip = startZip;
    }

    public Integer getEndZip() {
        return endZip;
    }

    public void setEndZip(Integer endZip) {
        this.endZip = endZip;
    }
}
