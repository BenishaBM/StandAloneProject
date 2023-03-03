package Entity;

import java.util.HashMap;
import java.util.List;

public interface Service {
	public List<CustomerEntity> createCustomer();
	public List<Object> displayCustomerDetails();
	public HashMap<String, Object> searchCustomerDetails();
    public void depositTheAmount();
	public void withdrawTheAmount() throws NoSufficientBalanceException;
    public void deleteTheCustomer();
}
