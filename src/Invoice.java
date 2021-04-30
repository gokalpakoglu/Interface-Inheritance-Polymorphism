public class Invoice implements Payable {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		setPartNumber(partNumber);
		setPartDescription(partDescription);
		setQuantity(quantity);
		setPricePerItem(pricePerItem);

	}

	@Override
	public double getPaymentAmount() {
		return quantity * pricePerItem;
	}

	@Override
	public String toString() {
		return "Part Number:" + partNumber + "\nPart Description:" + partDescription + "\nQuantity:" + quantity+ "\nPrice Per Item:$" + pricePerItem;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity >= 0) {
			this.quantity = quantity;
		} else {
			System.out.println("Quantity must be greater than or equal to 0.");
			System.exit(7);
		}
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem > 0) {
			this.pricePerItem = pricePerItem;
		} else {
			System.out.println("Price per item must be greater than 0.");
			System.exit(7);
		}
	}

}
