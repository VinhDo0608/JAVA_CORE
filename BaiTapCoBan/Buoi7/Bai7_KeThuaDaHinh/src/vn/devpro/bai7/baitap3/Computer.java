package vn.devpro.bai7.baitap3;

public class Computer extends Electronic {

	private double hdd;
	private double ram;
	private double cpu;
	
	public void display() {
		super.display();
		System.out.printf("%7.2f %7.2f %7.2f%n", this.hdd, this.ram, this.cpu);
	}
	
	public Computer() {
		super();
	}
	
	public Computer(String code, String name, int amount, double price, String manufacturer, double power, double hdd,
			double ram, double cpu) {
		super(code, name, amount, price, manufacturer, power);
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
	}
	
	
}
