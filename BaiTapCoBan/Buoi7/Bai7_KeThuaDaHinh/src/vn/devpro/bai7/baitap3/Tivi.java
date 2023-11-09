package vn.devpro.bai7.baitap3;

public class Tivi extends Electronic {
	
	private String brand;
	private double monitor;
	
	public void display() {
		super.display();
		System.out.printf("%-15s %8.2f%n", this.brand, this.monitor);
	}
	
	public Tivi() {
		super();
	}
	
	public Tivi(String code, String name, int amount, double price, String manufacturer, 
			double power, String brand,	double monitor) {
		super(code, name, amount, price, manufacturer, power);
		this.brand = brand;
		this.monitor = monitor;
	}
}
