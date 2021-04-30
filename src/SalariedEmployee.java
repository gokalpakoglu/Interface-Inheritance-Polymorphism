
public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		setWeeklySalary(weeklySalary);

	}

	@Override
	public double getPaymentAmount() {
		return weeklySalary;
	}
	

	@Override
	public String toString() {
		return super.toString()+"\nWeekly Salary:$" + weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if(weeklySalary>=0) 
		{
			this.weeklySalary = weeklySalary;
		}
		else 
		{
			System.out.println("WeeklySalary must be greater than or equal to 0.");
			System.exit(7);
		}
	}

}
