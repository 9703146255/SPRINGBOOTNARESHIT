package in.thiru.dto;

public class AddressDto {
	
		private String hno;
	    private String apartmentNo;
	    private String state;
	    private String country;
	    
		public String getHno() {
			return hno;
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
		public AddressDto(String hno, String apartmentNo, String state, String country) {
			super();
			this.hno = hno;
			this.apartmentNo = apartmentNo;
			this.state = state;
			this.country = country;
		}
	    
	    public AddressDto() {
			// TODO Auto-generated constructor stub
		}

}
