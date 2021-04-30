public class Test {

	public static void main(String[] args) {
		Payable []payableObjects = new Payable[6];
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		payableObjects[3] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40.00);
		payableObjects[4] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000.00, 0.06);
		payableObjects[5] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000.00, 0.04, 300.00);
		System.out.println("------ Invoices and Employees processed polymorphically:------\n");
		for (int i = 0; i < 6; i++) {
			System.out.println(payableObjects[i]);
			if (payableObjects[i] instanceof BasePlusCommissionEmployee) {
				((BasePlusCommissionEmployee) payableObjects[i]).setBaseSalary(((BasePlusCommissionEmployee) payableObjects[i]).getBaseSalary() / 10+ ((BasePlusCommissionEmployee) payableObjects[i]).getBaseSalary());
				System.out.println("New base salary with 10% increase is:$"+ ((BasePlusCommissionEmployee) payableObjects[i]).getBaseSalary());
			}
			System.out.println("Earnings:$" + payableObjects[i].getPaymentAmount() + "\n");
		}
		for (int j = 0; j < 6; j++) {
			System.out.println("Employee " + j + " is a " + payableObjects[j].getClass().getName());
		}

	}

}
