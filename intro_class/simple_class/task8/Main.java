package by.godev.intro_class.simple_class.task8;

/*
 * 8. Создать класс Customer, спецификация которого приведена ниже. 
 * Определить конструкторы, set-и get-методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль. 
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
 * Найти и вывести: 
 * a) список покупателей в алфавитном порядке; 
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 * */

public class Main {

	public static void main(String[] args) {
		OurCustomers allCustomers;
		SortAndSearh sortAndSearh;
		TestCustomers testCustomers;
		ViewCustomer view;

		allCustomers = new OurCustomers();
		sortAndSearh = new SortAndSearh();
		testCustomers = new TestCustomers();
		view = new ViewCustomer();

		testCustomers.addTest(allCustomers);

		sortAndSearh.bubbleCostomresSort(allCustomers);

		System.out.printf("\nСписок покупателей в алфавитном порядке:");
		view.printAllCustomersInfo(allCustomers);

		System.out.printf("\nCписок покупателей, у которых номер кредитной карточки\nнаходится в заданном интервале:");
		view.printAllCustomersInfo(
				sortAndSearh.searchByCardNumberInterval(allCustomers, 1000000000000000L, 9259588011287198L));

	}

}
