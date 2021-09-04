package by.godev.intro_class.aggregation.task4;

public class TestBankCustomer {
	public TestBankCustomer() {

	}

	public BankCustomer addTestCustomer() {
		BankCustomer customer;
		String surname;
		String firstName;
		String middleName;
		String address;
		BankAccount b1;
		BankAccount b2;
		BankAccount b3;
		BankAccount b4;
		BankAccount b5;
		int numberOfAccounts;
		BankAccount[] accounts;
		CustomerBankAccounts customerAccounts;

		surname = new String("Лавлейс");
		firstName = new String("Ада");
		middleName = new String("Августа");
		address = new String("Великобритания, Лондон");

		numberOfAccounts = 5;
		b1 = new BankAccount(-320, true);
		b2 = new BankAccount(7500, true);
		b3 = new BankAccount(10000, true);
		b4 = new BankAccount(-100, false);
		b5 = new BankAccount(5000, false);
		accounts = new BankAccount[numberOfAccounts];
		accounts[0] = b1;
		accounts[1] = b2;
		accounts[2] = b3;
		accounts[3] = b4;
		accounts[4] = b5;
		customerAccounts = new CustomerBankAccounts(accounts);

		customer = new BankCustomer(surname, firstName, middleName, address, customerAccounts);

		return customer;
	}
}
