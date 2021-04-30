
public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		setWage(wage);
		setHours(hours);
	}

	@Override
	public double getPaymentAmount() {
		if (hours <= 40) {
			return wage * hours;
		} else if (hours > 40) {
			return (40 * wage) + ((hours - 40) * wage * 1.5);
		}
		return 0;

	}
	@Override
	public String toString() {
		return super.toString()+"\nWage:$"+wage+"\nHours:"+hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage >= 0) {
			this.wage = wage;
		} else {
			System.out.println("Wage must be greater than or equal to 0.");
			System.exit(7);
		}
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if (hours >= 0 && hours < 168) {
			this.hours = hours;
		} else {
			System.out.println("Hours must be greater than 0 and less than 168.");
			System.exit(7);
		}
	}

}
