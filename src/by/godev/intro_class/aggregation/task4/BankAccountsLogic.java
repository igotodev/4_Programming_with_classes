package by.godev.intro_class.aggregation.task4;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. 
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. 
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 * */

public class BankAccountsLogic {
	public BankAccountsLogic() {

	}

	public void sortAccountsByAccountNumber(CustomerBankAccounts accounts) {
		for (int i = 0; i < accounts.getAccounts().length; i++) {
			for (int j = 1; j < accounts.getAccounts().length - i; j++) {
				if (accounts.getAccounts()[j].getAccountNumber() < accounts.getAccounts()[j - 1].getAccountNumber()) {
					BankAccount mid;
					mid = accounts.getAccounts()[j];
					accounts.getAccounts()[j] = accounts.getAccounts()[j - 1];
					accounts.getAccounts()[j - 1] = mid;
				}
			}
		}
	}

	// от большей суммы к меньшей
	public void sortAccountsByAmountOfMoney(CustomerBankAccounts accounts) {
		for (int i = 0; i < accounts.getAccounts().length; i++) {
			for (int j = 1; j < accounts.getAccounts().length - i; j++) {
				if (accounts.getAccounts()[j].getBalance() > accounts.getAccounts()[j - 1].getBalance()) {
					BankAccount mid;
					mid = accounts.getAccounts()[j];
					accounts.getAccounts()[j] = accounts.getAccounts()[j - 1];
					accounts.getAccounts()[j - 1] = mid;
				}
			}
		}
	}

	private int searchIndexByAccountNumber(CustomerBankAccounts accounts, long accountNumber) {
		// приводим к отсортированному по номерам виду
		sortAccountsByAccountNumber(accounts);

		int firstIndex;
		int lastIndex;

		firstIndex = 0;
		lastIndex = accounts.getAccounts().length - 1;

		while (firstIndex <= lastIndex) {
			int middleIndex;

			middleIndex = (firstIndex + lastIndex) / 2;

			if (accounts.getAccounts()[middleIndex].getAccountNumber() == accountNumber) {
				return middleIndex;
			} else if (accounts.getAccounts()[middleIndex].getAccountNumber() < accountNumber) {
				firstIndex = middleIndex + 1;
			} else if (accounts.getAccounts()[middleIndex].getAccountNumber() > accountNumber && middleIndex != 0) {
				lastIndex = middleIndex - 1;
			}
		}

		return -1;
	}

	public BankAccount searchByAccountNumber(CustomerBankAccounts accounts, long accountNumber) {
		int index;
		index = searchIndexByAccountNumber(accounts, accountNumber);

		if (index != -1) {
			return accounts.getAccounts()[index];
		}

		return null;
	}

	public double calculationTotalAmountOfAccounts(CustomerBankAccounts accounts) {
		double total;

		total = 0;

		for (BankAccount a : accounts.getAccounts()) {
			total += a.getBalance();
		}

		return total;
	}

	public double calculationAmountForAccountsWithPositiveBalances(CustomerBankAccounts accounts) {
		double positiveTotal;

		positiveTotal = 0;

		for (BankAccount a : accounts.getAccounts()) {
			if (a.getBalance() > 0) {
				positiveTotal += a.getBalance();
			}
		}

		return positiveTotal;
	}

	public double calculationAmountForAccountsWithNegativeBalances(CustomerBankAccounts accounts) {
		double negativeTotal;

		negativeTotal = 0;

		for (BankAccount a : accounts.getAccounts()) {
			if (a.getBalance() < 0) {
				negativeTotal += a.getBalance();
			}
		}

		return negativeTotal;
	}

	public void blockBankAccount(CustomerBankAccounts accounts, long accountNumber) {
		int index;

		index = searchIndexByAccountNumber(accounts, accountNumber);

		accounts.getAccounts()[index].setActive(false);

	}

	public void unblockBankAccount(CustomerBankAccounts accounts, long accountNumber) {
		int index;

		index = searchIndexByAccountNumber(accounts, accountNumber);

		accounts.getAccounts()[index].setActive(true);
	}

}
