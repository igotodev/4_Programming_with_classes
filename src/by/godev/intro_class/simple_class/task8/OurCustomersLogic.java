package by.godev.intro_class.simple_class.task8;

public class OurCustomersLogic {
	
	public OurCustomersLogic() {
		
	}

	public boolean userCreateValidation(Customer[] customers, Customer c) {
		if (customers.length == 0) {
			return true;
		}
		for (int i = 0; i < customers.length; i++) {
			if (c.getFirstName().equals(customers[i].getFirstName())
					&& c.getMiddleName().equals(customers[i].getMiddleName())
					&& c.getSurname().equals(customers[i].getSurname())) {
				return false;
			}
			if (c.getId().equals(customers[i].getId())) {
				return false;
			}
			if (c.getBankAccount().getBankAccountNumber() == customers[i].getBankAccount().getBankAccountNumber()) {
				return false;
			}
			if (c.getBankAccount().getCreditCardNumber() == customers[i].getBankAccount().getCreditCardNumber()) {
				return false;
			}
		}
		return true;
	}

}
