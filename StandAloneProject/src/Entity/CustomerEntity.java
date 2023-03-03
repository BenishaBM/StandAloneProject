package Entity;

import java.util.Date;

public class CustomerEntity {
	private int custId;
	private String firstName;
	private String lastName;
	private String dob;
	private AccountEntity account;
	private long mobileNumber;
	private String emailId;
	private AddressEntity address;

	public CustomerEntity() {
	}

	public CustomerEntity(int custId, String firstName, String lastName, String dob, AccountEntity account,
			long mobileNumber, String emailId, AddressEntity address) {
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.account = account;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.address = address;

	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public AccountEntity getAccount() {
		return account;
	}

	public void setAccount(AccountEntity account) {
		this.account = account;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerEntity [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob="
				+ dob + ", account=" + account + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ ", address=" + address + "]";
	}

}
