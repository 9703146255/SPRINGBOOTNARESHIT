package in.thiru.model;

public class UserDTO {
	
	 	private Integer userId;
	    private String userName;
	    private String email;
	    private AddressDTO address;
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public AddressDTO getAddress() {
			return address;
		}
		public void setAddress(AddressDTO address) {
			this.address = address;
		}
	    
	    

}
