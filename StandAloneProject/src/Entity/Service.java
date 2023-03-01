package Entity;

import java.util.Map;

public interface Service  {
	public void createCustomer();
	//public void searchByCustomerNumber();
	public CustomerEntity addCustomer(Map<String, Object>inputMap);
}
