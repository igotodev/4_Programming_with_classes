package by.godev.intro_class.simple_class.task8;

public class SortAndSearh {
	
	public SortAndSearh() {
		
	}

	public void bubbleCostomresSort(OurCustomers customers) {
		Customer[] arr;

		arr = new Customer[customers.getAllCustomers().length];
		arr = customers.getAllCustomers();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				Customer mid;
				if (arr[j].getSurname().compareTo(arr[j - 1].getSurname()) < 0) {
					mid = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = mid;
				} else if (arr[j].getSurname().compareTo(arr[j - 1].getSurname()) == 0) {
					if (arr[j].getFirstName().compareTo(arr[j - 1].getFirstName()) < 0) {
						mid = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = mid;
					} else if (arr[j].getFirstName().compareTo(arr[j - 1].getFirstName()) == 0) {
						if (arr[j].getMiddleName().compareTo(arr[j - 1].getMiddleName()) < 0) {
							mid = arr[j];
							arr[j] = arr[j - 1];
							arr[j - 1] = mid;
						}
					}
				}
			}
		}

		customers.setAllCustomers(arr);
	}

	public OurCustomers searchByCardNumberInterval(OurCustomers customers, long start, long end) {
		OurCustomers result;

		result = new OurCustomers();

		for (Customer c : customers.getAllCustomers()) {
			if (c.getBankAccount().getCreditCardNumber() >= start && c.getBankAccount().getCreditCardNumber() <= end) {
				result.addCustomer(c);
			}
		}

		return result;

	}
}
