package in.thiru.model;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addressId;

    private String HNO;
    private String apartmentNo;
    private String state;
    private String country;

    // Constructors, getters, and setters

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getHNO() {
        return HNO;
    }

    public void setHNO(String HNO) {
        this.HNO = HNO;
    }

    public String getApartmentNo() {
        return apartmentNo;
    }

    public void setApartmentNo(String apartmentNo) {
        this.apartmentNo = apartmentNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Other methods

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", HNO='" + HNO + '\'' +
                ", apartmentNo='" + apartmentNo + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
