package by.godev.intro_class.aggregation.task4;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. 
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. 
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 * */

public class Main {

	public static void main(String[] args) {
		TestBankCustomer test;
		BankCustomer customer;
		BankAccountsLogic logic;
		BankAccountView view;
		long exampleAccountNumber;

		test = new TestBankCustomer();
		customer = test.addTestCustomer();
		logic = new BankAccountsLogic();
		view = new BankAccountView();

		logic.sortAccountsByAccountNumber(customer.getCustomerBankAccounts());
		System.out.printf("\nСчета отсортированные по номеру счета:");
		for (BankAccount a : customer.getCustomerBankAccounts().getAccounts()) {
			view.printAccountInfo(a);
		}

		logic.sortAccountsByAmountOfMoney(customer.getCustomerBankAccounts());
		System.out.printf("\nСчета отсортированные по суммам на счете:");
		for (BankAccount a : customer.getCustomerBankAccounts().getAccounts()) {
			view.printAccountInfo(a);
		}

		exampleAccountNumber = customer.getCustomerBankAccounts().getAccounts()[2].getAccountNumber();
		// блокируем аккаунт
		logic.blockBankAccount(customer.getCustomerBankAccounts(), exampleAccountNumber);
		System.out.printf("\nПример поиска по счетy №%d:", exampleAccountNumber);
		view.printAccountInfo(logic.searchByAccountNumber(customer.getCustomerBankAccounts(), exampleAccountNumber));

		// разблокируем аккаунт
		logic.unblockBankAccount(customer.getCustomerBankAccounts(), exampleAccountNumber);
		System.out.printf("\nПример поиска по счетy №%d:", exampleAccountNumber);
		view.printAccountInfo(logic.searchByAccountNumber(customer.getCustomerBankAccounts(), exampleAccountNumber));

		System.out.printf("\nОбщая сумма по все счетам: %.2f\n",
				logic.calculationTotalAmountOfAccounts(customer.getCustomerBankAccounts()));

		System.out.printf("Общая сумма по счетам имеющим положительный баланс: %.2f\n",
				logic.calculationAmountForAccountsWithPositiveBalances(customer.getCustomerBankAccounts()));

		System.out.printf("Общая сумма по счетам имеющим отрицательный баланс: %.2f\n",
				logic.calculationAmountForAccountsWithNegativeBalances(customer.getCustomerBankAccounts()));
	}

}
