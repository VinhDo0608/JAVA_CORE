package vn.devpro.OOP;

public class Car {
	private int id;
	private String brand;
	private double price;
	private String manufacture;
	
	
	public Car() {
		this.id = 1;
		this.brand = "Vios";
		this.price = 25000;
		this.manufacture = "Toyota";
	}



	public Car(int id, String brand, double price, String manufacture) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.manufacture = manufacture;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", price=" + price + ", manufacture=" + manufacture + "]";
	}
	
	
}