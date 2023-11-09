package vn.devpro.bai7.baitap3;

public class Electronic extends Product {

	protected String manufacturer;
	protected double power;
	
	public void display() {
		super.display();
		System.out.printf("%-15s %9.2f ", this.manufacturer, this.power);
	}
	
	public Electronic() {
		super();
	}
	
	public Electronic(String code, String name, int amount, double price, String manufacturer, double power) {
		super(code, name, amount, price);
		this.manufacturer = manufacturer;
		this.power = power;
	}
	
	
}
