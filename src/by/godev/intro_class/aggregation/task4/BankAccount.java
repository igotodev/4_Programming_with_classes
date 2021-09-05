package by.godev.intro_class.aggregation.task4;

import java.util.Objects;

public class BankAccount {
	private long accountNumber;
	private boolean active;
	private double balance;

	public BankAccount() {
		this.accountNumber = Generation.createLongNumber(12);
		this.active = true;
		balance = 0;
	}

	public BankAccount(double balance, boolean active) {
		this.accountNumber = Generation.createLongNumber(12);
		this.active = active;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return this.accountNumber;
	}

	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, active, balance);
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
		BankAccount other = (BankAccount) obj;
		return accountNumber == other.accountNumber && active == other.active
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [accountNumber=" + accountNumber + ", active=" + active
				+ ", balance=" + balance + "]";
	}
}
