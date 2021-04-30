
public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		setBaseSalary(baseSalary);

	}

	@Override
	public double getPaymentAmount() {
		return (super.getPaymentAmount()) + baseSalary;
	}
	

	@Override
	public String toString() {
		return super.toString()+"\nBase Salary:" + baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary >= 0) {
			this.baseSalary = baseSalary;
		} else {
			System.out.println("BaseSalary must be greater than or equal to 0.");
			System.exit(7);
		}
	}

}
