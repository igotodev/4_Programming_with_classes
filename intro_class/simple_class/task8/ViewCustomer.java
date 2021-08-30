package by.godev.intro_class.simple_class.task8;

public class ViewCustomer {

	public ViewCustomer() {

	}

	public void printCustomerInfo(Customer c) {
		System.out.printf("ID: \t\t\t%s\n", c.getId());
		System.out.printf("Surname: \t\t%s\n", c.getSurname());
		System.out.printf("Name: \t\t\t%s\n", c.getFirstName());
		System.out.printf("Middle Name: \t\t%s\n", c.getMiddleName());
		System.out.printf("Address: \t\t%s\n", c.getAddress());
		System.out.printf("Bank Account Number: \t%s\n", c.getBankAccount().getBankAccountNumber());
		System.out.printf("Credit Card Number: \t%s\n", c.getBankAccount().getCreditCardNumber());
	}

	public void printAllCustomersInfo(OurCustomers customers) {
		for (int i = 0; i < customers.getAllCustomers().length; i++) {
			System.out.printf("\n----------------------------------------------\n");
			printCustomerInfo(customers.getAllCustomers()[i]);
		}
	}
}
