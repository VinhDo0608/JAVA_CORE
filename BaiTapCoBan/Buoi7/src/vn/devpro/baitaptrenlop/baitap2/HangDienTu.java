package vn.devpro.baitaptrenlop.baitap2;

public class HangDienTu extends SanPham{

	private double power;
	private double price;
	
	public void input() {
		super.input();
		System.out.print("\tNhap cong suat: ");
		this.power = Double.parseDouble(sc.nextLine());
		System.out.print("\tNhap gia tien: ");
		this.price = Double.parseDouble(sc.nextLine());
	}
	
	public void display() {
		super.display();
		System.out.printf("%,9.2f %,13.2f%n", this.power, this.price);
	}
	
	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public HangDienTu(double power, double price) {
		super();
		this.power = power;
		this.price = price;
	}
	
	public HangDienTu() {
		super();
	}
	
}
