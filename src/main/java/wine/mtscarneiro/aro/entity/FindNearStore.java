package wine.mtscarneiro.aro.entity;

import wine.mtscarneiro.aro.model.StoreNameCode;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_clients")
public class FindNearStore implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer zipCode;
    private String nearStoreName;

    public FindNearStore() {
    }

    public FindNearStore(Long id, Integer zipCode, String nearStoreName) {
        this.id = id;
        this.zipCode = zipCode;
        this.nearStoreName = nearStoreName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getNearStoreName() {
        return nearStoreName;
    }

    public void setNearStoreName(String nearStoreName) {
        this.nearStoreName = nearStoreName;
    }

}
