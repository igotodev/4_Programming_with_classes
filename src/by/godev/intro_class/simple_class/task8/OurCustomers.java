package by.godev.intro_class.simple_class.task8;

import java.util.Arrays;

public class OurCustomers {
	private Customer[] allCustomers;

	public OurCustomers() {
		this.allCustomers = new Customer[] {};
	}

	public Customer[] getAllCustomers() {
		return this.allCustomers;
	}
	
	public void setAllCustomers(Customer[] allCustomers) {
		this.allCustomers = allCustomers;
	}

	public boolean addCustomer(Customer c) {
		OurCustomersLogic logic = new OurCustomersLogic();
		if (!logic.userCreateValidation(allCustomers, c)) {
			return false;
		}
		this.allCustomers = Arrays.copyOf(this.allCustomers, this.allCustomers.length + 1);
		this.allCustomers[this.allCustomers.length - 1] = c;

		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(allCustomers);
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
		OurCustomers other = (OurCustomers) obj;
		return Arrays.equals(allCustomers, other.allCustomers);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [allCustomers=" + Arrays.toString(allCustomers) + "]";
	}

}
