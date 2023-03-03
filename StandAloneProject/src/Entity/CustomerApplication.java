package Entity;
import java.util.Scanner;

public class CustomerApplication {

	
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws NoSufficientBalanceException {
		
		ServiceImplementation service = new ServiceImplementation();
        boolean isRunning = true;
		do {
			System.out.println("Select an option:");
			System.out.println("1. Create new customer");
			System.out.println("2. Display customer account details");
			System.out.println("3. Search by customer number");
			System.out.println("4. Deposit the amount");
			System.out.println("5. Withdraw the amount");
			System.out.println("6. Delete the customer");
			System.out.println("7. Exit");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				service.createCustomer();
				break;
			case 2:
			 service.displayCustomerDetails();
				break;
			case 3:
			  service.searchCustomerDetails();
			  break;
			case 4:
				 service.depositTheAmount();;
				break;
			case 5:
			//service.withdrawTheAmount();
				//service.withdraw();
			break;
			case 6:
				// deleteTheCustomer();
				break;
			case 7:
			{
				isRunning = false;
				System.out.println("\t\t\t\t\t*****Exit*******\n");
				break;
			}
			default:
				System.out.println("Invalid choice, please try again");
			break;
			}}while(isRunning);
		
	}


	}
		
	



