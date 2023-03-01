package Entity;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class ServiceImplementation{
	
	ArrayList<CustomerEntity> list = new ArrayList<>();
	
	public List<CustomerEntity> createCustomer(){
		
		ArrayList<HashMap<String, Object>> list2 = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		
		for(int i=0;i<2;i++) {
			list.add(getCustomerDetails());
		}
		return list;
	}
	
	public List<HashMap<String, Object>> displayCustomerDetails(){
		HashMap<String, Object> list2 = new HashMap<>();
		List<HashMap<String, Object>> data = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			list2.put("CustomerId",list.get(i).getCustId());
			list2.put("CustomerName", list.get(i).getFirstName());
			list2.put("AccountNumer", list.get(i).getAccount().getAccountNumber());
			list2.put("CurrentBalance", list.get(i).getAccount().getCurrentBalance());
			data.add(list2);
			
		}
		System.out.println(data);
		return data;
	}
	
	public CustomerEntity getCustomerDetails() {
		Scanner scanner = new Scanner(System.in);
		CustomerEntity customer = new CustomerEntity();
		System.out.println("Enter the customer Details");
		System.out.println("Enter the Customer id: ");
		customer.setCustId(scanner.nextInt());
		System.out.println("Enter the first Name");
		customer.setFirstName(scanner.next());
		System.out.println("Enter the last Name");
		customer.setLastName(scanner.next());
		System.out.println("Enter the DateOfBirth");
		customer.setDob(scanner.next());
		System.out.println("Enter the Mobile Number");
		customer.setMobileNumber(scanner.nextLong());
		System.out.println("Enter the EmailId");
		customer.setEmailId(scanner.next());
	
		
		
		AccountEntity account= new AccountEntity();
		System.out.println("Enter the AccountId");
		account.setAccountId(scanner.nextInt());
		System.out.println("Enter the AccountNumber");
		account.setAccountNumber(scanner.nextInt());
		System.out.println("select  the AccountType");
		System.out.println("1.Credit Account");
		System.out.println("2.Debit Account");
		if(scanner.nextInt()==1)
		{
			System.out.println("credit");
		}
		else if(scanner.nextInt()==2)
		{
		System.out.println("Debit");
		}
		else
		{
			System.out.println("select correct option");
		}
       System.out.println("Enter the CardNumber");
	   account.setCardNumber(scanner.next());
	   System.out.println("Enter the isAccountActive");
	   account.setAccountActive(scanner.nextBoolean());
	   System.out.println("Enter the currentBalance");
	   account.setCurrentBalance(scanner.nextDouble());
	   customer.setAccountNumber(account);
	   

	   
	   AddressEntity address = new AddressEntity();
	   System.out.println("Enter the AddressId");
	   address.setAddressId(scanner.nextInt());
	   System.out.println("Enter the Street");
	   address.setStreet(scanner.next());
	   System.out.println("Enter the City");
	   address.setCity(scanner.next());
	   System.out.println("Enter the country");
	   address.setCountry(scanner.next());
	   System.out.println("Enter the PinCode");
	   address.setPinCode(scanner.next());
	   
		customer.setAddress(address);
		
		return customer;
		

}
	
}
