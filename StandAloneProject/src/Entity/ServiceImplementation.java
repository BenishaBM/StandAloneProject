package Entity;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ServiceImplementation implements Service {

	private static Scanner scanner = new Scanner(System.in);
	ArrayList<CustomerEntity> list = new ArrayList<>();

	public List<CustomerEntity> createCustomer() {
		
		ArrayList<HashMap<String, Object>> list2 = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		System.out.println("Enter the number of Entry");
		try {
		int entry_num = scanner.nextInt();
		for (int i = 0; i < entry_num; i++) {
			list.add(getCustomerDetails());
		}
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}
		return list;
	}

	public CustomerEntity getCustomerDetails() throws InputMismatchException {
		CustomerEntity customer = new CustomerEntity();
		try {

			System.out.println("Enter the customer Details");
			System.out.println("Enter the Customer id: ");
			customer.setCustId(scanner.nextInt());
            System.out.println("Enter the first Name");
			customer.setFirstName(scanner.next());
            System.out.println("Enter the last Name");
			customer.setLastName(scanner.next());
            System.out.println("Enter the DateOfBirth (in yyyy-mm-dd format)");
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
				System.out.println("Credit Account Activate");
			} else if (scanner.nextInt() == 2) {
				System.out.println("Debit Account Activate");
			} else {
				throw new InputMismatchException("Invalid input. Please select either 1 or 2.");
			}
			System.out.println("Enter the CardNumber");
			account.setCardNumber(scanner.next());
            System.out.println("Is the Account Active? (true/false)");
			account.setAccountActive(scanner.nextBoolean());
            System.out.println("Enter the currentBalance");
			account.setCurrentBalance(scanner.nextDouble());
            customer.setAccount(account);
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
            } 
//	        catch (InputMismatchException e) {
//	        System.out.println("Invalid input. " + e.getMessage());
//	        }
		    catch (NoSuchElementException e) {
		    System.out.println("Input not found. " + e);
		     }
	       catch (Exception e) {
			e.printStackTrace();
		}

		return customer;

	}

	public List<Object> displayCustomerDetails() {
		HashMap<String, Object> list2 = new HashMap<>();
		List<Object> data = new ArrayList<>();
		List<Object> newList = new ArrayList<>();

		for (CustomerEntity customer : list) {
			HashMap<String, Object> list3 = new HashMap<>();
			list3.put("CustomerId", customer.getCustId());
			list3.put("CustomerName", customer.getFirstName());
			list3.put("AccountNumber", customer.getAccount().getAccountNumber());
			list3.put("CurrentBalance", customer.getAccount().getCurrentBalance());
			list3.put("City", customer.getAddress().getCity());
			list3.put("MobileNumber", customer.getMobileNumber());
			System.out.println(list3);

		}

		return data;
	}

	public HashMap<String, Object> searchCustomerDetails() {
		HashMap<String, Object> data = new HashMap<>();
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
		System.out.println("Enter the Account Number");
		int acc_Number = scanner.nextInt();
		double deposit;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccount().getAccountNumber() == acc_Number) {
				System.out.println("Enter the Deposit Amount");
				int deposit_Amount = scanner.nextInt();

				if (list.get(i).getAccount().isAccountActive() == true) {
					deposit = list.get(i).getAccount().getCurrentBalance() + deposit_Amount;

					System.out.println("Current Amount :" + deposit);

					list.get(i).getAccount().setCurrentBalance(deposit);

				}
			} else {
				System.out.println("Account is Not Active");

			}
		}
	}

	public void withdrawTheAmount() {
		System.out.println("Enter the Account Number");
		int acc_Number = scanner.nextInt();
		double withDraw;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccount().getAccountNumber() == acc_Number) {
				System.out.println("Enter the Withdraw Amount");
				int with_Draw = scanner.nextInt();
//	
				try {
					if (list.get(i).getAccount().getCurrentBalance() < with_Draw) {
						throw new NoSufficientBalanceException("No current balance");
					} else {
						withDraw = list.get(i).getAccount().getCurrentBalance() - with_Draw;
						System.out.println(withDraw);
						list.get(i).getAccount().setCurrentBalance(withDraw);
						System.out.println("current balance");

					}

				} catch (NoSufficientBalanceException e) {
					e.printStackTrace();
				}

			}

			else {
				System.out.println("Invalid Account Number");
			}

		}
	}

	public void deleteTheCustomer() {

		System.err.println("Enter the Account Number");
		int acc_Num = scanner.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccount().getAccountNumber() == acc_Num) {
				System.out.println("Are u conform delete the account");
				System.out.println();

				System.out.println("Select the option");
				System.out.println();
				System.out.println("1.Yes");
				System.out.println();
				System.out.println("2.No");

				System.out.println("Enter the option");
				int dele_num = scanner.nextInt();
				if (dele_num == 1) {
					System.out.println("customer details are deleted in bank");
					list.remove(i);
				} else if (dele_num == 2) {
					System.out.println("Account are not deleted");
				}

				else {
					System.out.println("invalid option");
				}

			}

			else {
				System.out.println("Account Number is wrong");
			}
		}
	}
}
