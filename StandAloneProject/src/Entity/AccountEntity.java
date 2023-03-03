package Entity;

public class AccountEntity {
	private int accountId;
	private int accountNumber;
	private String accountType;
	private String cardNumber;
	private boolean isAccountActive;
	private double currentBalance;

	public AccountEntity() {
	}

	public AccountEntity(int accountId, int accountNumber, String accountType, String cardNumber,
			boolean isAccountActive, double currentBalance) {
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.cardNumber = cardNumber;
		this.isAccountActive = isAccountActive;
		this.currentBalance = currentBalance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public boolean isAccountActive() {
		return isAccountActive;
	}

	public void setAccountActive(boolean isAccountActive) {
		this.isAccountActive = isAccountActive;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	@Override
	public String toString() {
		return "AccountEntity [accountId=" + accountId + ", accountNumber=" + accountNumber + ", accountType="
				+ accountType + ", cardNumber=" + cardNumber + ", isAccountActive=" + isAccountActive
				+ ", currentBalance=" + currentBalance + "]";
	}

}
