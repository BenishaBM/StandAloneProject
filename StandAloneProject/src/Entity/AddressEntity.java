package Entity;

public class AddressEntity {

	private int addressId;
	private String street;
	private String city;
	private String country;
	private String pinCode;
	
	public AddressEntity() {
	}
	public AddressEntity(int addressId, String street, String city, String country, String pinCode) {
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "AddressEntity [addressId=" + addressId + ", street=" + street + ", city=" + city + ", country="
				+ country + ", pinCode=" + pinCode + "]";
	}

	
	
}
