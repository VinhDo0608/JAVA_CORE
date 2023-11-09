package vn.devpro.baitaptrenlop.baitap3;

public class Tivi extends Electronic{
	
	private String brand;
	private double monitor;
	
	public void display() {
		super.display();
		System.out.printf("%-15s %8.2f%n", this.brand, this.monitor);
	}
	
	public Tivi(String code, String name, int amount, double price, String manufacture, double  power, String brand,
			double monitor) {
		super(code, name, amount, price, manufacture, power);
		this.brand = brand;
		this.monitor = monitor;
	}


	public Tivi() {
		super();
	}
	
	
	
}
