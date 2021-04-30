
public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		setgrossSales(grossSales);
		setCommissionRate(commissionRate);

	}

	@Override
	public double getPaymentAmount() {
		return grossSales * commissionRate;
	}

	@Override
	public String toString() {
		return super.toString()+"\nGross Sales:$" + grossSales + "\nCommission Rate:" + commissionRate;
	}

	public double getgrossSales(double grossSales) {
		return grossSales;
	}

	public void setgrossSales(double grossSales) {
		if (grossSales >= 0) {
			this.grossSales = grossSales;
		} else {
			System.out.println("GrossSales must be greater than or equal to 0.");
			System.exit(7);
		}
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate > 0 && commissionRate < 1) {
			this.commissionRate = commissionRate;
		} else {
			System.out.println("CommissionRate must be greater than 0 and less than 1.");
			System.exit(7);
		}
	}

}
