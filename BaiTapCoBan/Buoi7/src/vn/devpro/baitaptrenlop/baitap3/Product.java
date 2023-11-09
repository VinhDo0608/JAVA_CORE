package vn.devpro.baitaptrenlop.baitap3;

public class Product {
	protected String code;
	protected String name;
	protected int amount;
	protected double price;
	
	public void display() {
		System.out.printf("%-10s %-25s %8s %,14.2f ", 
				this.code, this.name, this.amount, this.price);
	}
	
	public Product(String code, String name, int amount, double price) {
		super();
		this.code = code;
		this.name = name;
		this.amount = amount;
		this.price = price;
	}
	
	public Product() {
		super();
	}
	
	
}
