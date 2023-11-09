package vn.devpro.baitaptrenlop.baitap3;

public class Electronic extends Product{
	
	protected String manufacture;
	protected double power;
	
	public void display() {
		super.display();
		System.out.printf("%-15s %9.2f ", this.manufacture, this.power);	
	}
	
	public Electronic(String code, String name, int amount, double price, String manufacture, double power) {
		super(code, name, amount, price);
		this.manufacture = manufacture;
		this.power = power;
	}

	public Electronic() {
		super();
	}
	
	
	
	
}
