package by.godev.intro_class.simple_class.task8;

import java.util.Objects;

//id, surname, firstName, middleName, address, creditCardNumber, bankAccountNumber
public class Customer {
	private String id;
	private String surname;
	private String firstName;
	private String middleName;
	private String address;
	private BankAccount bankAccount;

	public Customer() {
		this.id = Generation.createID_U(20);
		this.surname = new String("");
		this.firstName = new String("");
		this.middleName = new String("");
		this.address = new String("");
		this.bankAccount = new BankAccount();
	}

	public Customer(String surname, String firstName, String middleName, String address) {
		this.id = Generation.createID_U(20);
		this.surname = new String(surname);
		this.firstName = new String(firstName);
		this.middleName = new String(middleName);
		this.address = new String(address);
		this.bankAccount = new BankAccount();
	}

	public String getId() {
		return id;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", surname=" + surname + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", address=" + address + ", bankAccount=" + bankAccount + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(address, firstName, middleName, surname);
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
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(middleName, other.middleName) && Objects.equals(surname, other.surname);
	}

}
