package by.godev.intro_class.aggregation.task4;

import java.util.Arrays;

public class CustomerBankAccounts {
	private BankAccount[] accounts;

	public CustomerBankAccounts() {
		this.accounts = new BankAccount[] {};
	}

	public CustomerBankAccounts(BankAccount[] accounts) {
		this.accounts = accounts;
	}

	public BankAccount[] getAccounts() {
		return accounts;
	}

	public void setAccounts(BankAccount[] accounts) {
		this.accounts = accounts;
	}

	public void addAccounts(BankAccount account) {
		this.accounts = Arrays.copyOf(this.accounts, this.accounts.length + 1);
		this.accounts[accounts.length - 1] = account;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(accounts);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CustomerBankAccounts other = (CustomerBankAccounts) obj;
		return Arrays.equals(accounts, other.accounts);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [accounts=" + Arrays.toString(accounts) + "]";
	}
}
