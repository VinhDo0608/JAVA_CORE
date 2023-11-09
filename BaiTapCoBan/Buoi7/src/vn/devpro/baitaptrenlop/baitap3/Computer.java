package vn.devpro.baitaptrenlop.baitap3;

public class Computer extends Electronic{
	
	private double hdd;
	private double ram;
	private double cpu;
	
	public void display() {
		super.display();
		System.out.printf("%7.2f %7.2f %7.2f%n", this.hdd, this.ram, this.cpu);
	}
	
	public Computer(String code, String name, int amount, double price, String manufacture, double power, double hdd,
			double ram, double cpu) {
		super(code, name, amount, price, manufacture, power);
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
	}
	
	public Computer() {
		super();
	}
	
	
}
