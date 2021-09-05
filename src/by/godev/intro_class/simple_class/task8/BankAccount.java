package by.godev.intro_class.simple_class.task8;

import java.util.Objects;

public class BankAccount {
	private long creditCardNumber;
	private long bankAccountNumber;

	public BankAccount() {
		this.creditCardNumber = Generation.createLongNumber(16);
		this.bankAccountNumber = Generation.createLongNumber(12);
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankAccountNumber, creditCardNumber);
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
		return bankAccountNumber == other.bankAccountNumber && creditCardNumber == other.creditCardNumber;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [creditCardNumber=" + creditCardNumber + ", bankAccountNumber="
				+ bankAccountNumber + "]";
	}

}
