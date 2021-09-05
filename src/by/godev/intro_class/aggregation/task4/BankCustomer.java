package by.godev.intro_class.aggregation.task4;

import java.util.Objects;

public class BankCustomer {
	private String id;
	private String surname;
	private String firstName;
	private String middleName;
	private String address;
	private CustomerBankAccounts customerBankAccounts;

	public BankCustomer() {
		this.id = Generation.createID_U(10);
		this.surname = new String("");
		this.firstName = new String("");
		this.middleName = new String("");
		this.address = new String("");
		this.customerBankAccounts = new CustomerBankAccounts();
	}

	public BankCustomer(String surname, String firstName, String middleName, String address,
			CustomerBankAccounts accounts) {
		this.id = Generation.createID_U(14);
		this.surname = new String("");
		this.firstName = new String("");
		this.middleName = new String("");
		this.address = new String("");
		this.customerBankAccounts = accounts;
	}

	public String getId() {
		return this.id;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CustomerBankAccounts getCustomerBankAccounts() {
		return this.customerBankAccounts;
	}

	public void setCustomerBankAccounts(CustomerBankAccounts customerBankAccounts) {
		this.customerBankAccounts = customerBankAccounts;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, customerBankAccounts, firstName, id, middleName, surname);
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
		BankCustomer other = (BankCustomer) obj;
		return Objects.equals(address, other.address)
				&& Objects.equals(customerBankAccounts, other.customerBankAccounts)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
				&& Objects.equals(middleName, other.middleName) && Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", surname=" + surname + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", address=" + address + ", bankAccounts=" + customerBankAccounts
				+ "]";
	}
}
