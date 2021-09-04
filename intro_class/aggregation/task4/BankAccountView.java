package by.godev.intro_class.aggregation.task4;

public class BankAccountView {
	public BankAccountView() {

	}

	public void printAccountInfo(BankAccount account) {
		if (account == null) {
			System.out.println("Счет не найден");
			return;
		}
		System.out.printf("\n------------------------------------------\n");
		System.out.printf("Номер счета:\t%d\n", account.getAccountNumber());
		System.out.printf("Баланс:\t\t%.2f\n", account.getBalance());
		System.out.print("Статус:\t\t");
		if (!account.isActive()) {
			System.out.printf("заблокирован\n");
		} else {
			System.out.printf("активный\n");
		}
	}
}