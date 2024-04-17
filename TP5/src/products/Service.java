package products;

public class Service extends Product{
	
	private double pricePerUnit;
	private double amountUnits;
	private double tax = 0.21;
	
	public Service(String name, double pricePerUnit, double amountUnits) {
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.amountUnits  = amountUnits;
	}
	public double priceWithoutTax() {
		return (this.pricePerUnit * this.amountUnits);
	}
	
	public double totalTax() {
		return this.priceWithoutTax() * this.tax;
		
	}
	public double totalPrice() {
		return (this.priceWithoutTax() - this.totalTax());
	}

}
