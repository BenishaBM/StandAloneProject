package Entity;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ServiceImplementation {

	ArrayList<CustomerEntity> list = new ArrayList<>();

	public List<CustomerEntity> createCustomer() {

		ArrayList<HashMap<String, Object>> list2 = new ArrayList<>();
		Map<String, Object> map = new HashMap<>(); 
		System.out.println("Enter the no of Entry");
		Scanner scanner = new Scanner(System.in);
		int numberOfEntry = scanner.nextInt();

		for (int i = 0; i <numberOfEntry ; i++) {
			list.add(getCustomerDetails());
		}
		System.out.println(list);
		return list;
	}

	public List<Object> displayCustomerDetails() {
		HashMap<String, Object> list2 = new HashMap<>();
		List<Object> data = new ArrayList<>();
		List<Object> newList = new ArrayList<>();

		for(CustomerEntity customer: list) {
			
			HashMap<String, Object> list3 = new HashMap<>();
			list3.put("CustomerId", customer.getCustId());
			list3.put("CustomerName", customer.getFirstName());
			list3.put("AccountNumber", customer.getAccount().getAccountNumber());
			list3.put("CurrentBalance", customer.getAccount().getCurrentBalance());
			
			System.out.println(list3);
			
			
			
		}

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

		AccountEntity account = new AccountEntity();
		System.out.println("Enter the AccountId");
		account.setAccountId(scanner.nextInt());
		System.out.println("Enter the AccountNumber");
		account.setAccountNumber(scanner.nextInt());
		System.out.println("select  the AccountType");
		System.out.println("1.Credit Account");
		System.out.println("2.Debit Account");
		if (scanner.nextInt() == 1) {
			System.out.println("credit");
		} else if (scanner.nextInt() == 2) {
			System.out.println("Debit");
		} else {
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

	public HashMap<String, Object> searchCustomerDetails() {
		HashMap<String, Object> data = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Customer Id");
		int cust_Option = scanner.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCustId() == cust_Option) {
				data.put("CustomerId", list.get(i).getCustId());
				data.put("CustomerName", list.get(i).getFirstName());
				data.put("AccountNumer", list.get(i).getAccount().getAccountNumber());
				data.put("CurrentBalance", list.get(i).getAccount().getCurrentBalance());
				data.put("Street", list.get(i).getAddress().getStreet());
				data.put("City", list.get(i).getAddress().getCity());
				data.put("Country", list.get(i).getAddress().getCountry());
				data.put("PinCode", list.get(i).getAddress().getPinCode());
				break;
			}
		}
		System.out.println(data);
		return data;
	}

	public void depositTheAmount() {
		HashMap<String, Object> data = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Account Number");
		int acc_Number = scanner.nextInt();
		System.out.println("Enter the Deposit Amount");
		int deposit_Amount = scanner.nextInt();
		
		double deposit;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getAccount().getAccountNumber() == acc_Number)
			{
			if(list.get(i).getAccount().isAccountActive() == true)
			{
				deposit = list.get(i).getAccount().getCurrentBalance() + deposit_Amount;
			
				System.out.println(deposit);
			
				list.get(i).getAccount().setCurrentBalance(deposit);
						
			}
			else {
					System.out.println("Account is Not Active");
			}
			
		
		
			}}
	}
	

//	public void withdrawTheAmount() throws NoSufficientBalanceException {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the Account Number");
//		int acc_Number = scanner.nextInt();
//		System.out.println("Enter the Withdraw Amount");
//		int with_Draw = scanner.nextInt();
//		double withDraw;
//		
//		for (int i = 0; i < list.size(); i++)
//		{
//		
//		 if(list.get(i).getAccount().getAccountNumber()==acc_Number)
//			{
//				try {
//				if(list.get(i).getAccount().getCurrentBalance()<with_Draw)
//				{
//				//withDraw = list.get(i).getAccount().getCurrentBalance() - with_Draw;
//				throw new NoSufficientBalanceException("No current balance");
//				}
//				}
//				catch(NoSufficientBalanceException e)
//				{
//					System.out.println(e);
//				}
//				
//			}
//		 else {
//			 System.out.println("Account Number");
//		 }
//			
//				
//	
//}
//	}
}
