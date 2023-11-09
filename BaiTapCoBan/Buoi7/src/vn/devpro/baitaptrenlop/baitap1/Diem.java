package vn.devpro.baitaptrenlop.baitap1;

import java.util.Scanner;

public class Diem {
	private double x;
	private double y;
	
	static Scanner sc = new Scanner(System.in);
	
	public void nhap() {
		System.out.print("\tNhap hoanh do: ");
		this.x = sc.nextDouble();
		System.out.print("\tNhap tung do: ");
		this.y = sc.nextDouble();
	}
	
	public double kc(Diem B) {
		return Math.sqrt(Math.pow(B.x -this.x, 2) + Math.pow(B.y - this.y, 2));
	}
	

	
	public Diem() {
		super();
	}
	
	public Diem(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	
}
