package by.godev.intro_class.simple_class.task8;

public class TestCustomers {

	public void addTest(OurCustomers allCustomers) {
		Customer[] arr;
		int numberOfClients;

		numberOfClients = 5;
		arr = new Customer[numberOfClients];
		arr[0] = new Customer("Samoylova", "Anna", "Evgenevna", "Brest, St.Sovetskaya");
		arr[1] = new Customer("Avanesyan", "Elina", "Gavrushevich", "Minsk, Nezavisimosty");
		arr[2] = new Customer("Umashev", "Dmitry", "Nikolaevich", "Minks, St.Gaya");
		arr[3] = new Customer("Smith", "John", "Bean", "Brest, St.Pushkina");
		arr[4] = new Customer("Avanesyan", "Alya", "Nikolaevna", "Brest, St.Gogolya");

		for (int i = 0; i < arr.length; i++) {
			if (!allCustomers.addCustomer(arr[i])) {
				System.out.println("Что-то пошло не так...");
			}
		}

	}
}
