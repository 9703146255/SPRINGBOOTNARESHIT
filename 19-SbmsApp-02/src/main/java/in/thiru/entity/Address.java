package in.thiru.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	private String hno;
    private String apartmentNo;
    private String state;
    private String country;
    private Integer userId;
    

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getHno() {
		return hno;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public void setHno(String hno) {
		this.hno = hno;
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
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", apartmentNo=" + apartmentNo + ", state=" + state + ", country=" + country
				+ "]";
	}
	public Address(String hno, String apartmentNo, String state, String country) {
		super();
		this.hno = hno;
		this.apartmentNo = apartmentNo;
		this.state = state;
		this.country = country;
	}
    
    public Address() {
		// TODO Auto-generated constructor stub
	}

}
