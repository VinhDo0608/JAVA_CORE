package vn.devpro.bai7.interfacedemo;

import java.util.Scanner;

public class Circle implements Shape, IO {
	
	private double r;
	
	@Override
	public double area() {
		return pi * r;
	}
	
	@Override
	public double perimeter() {
		return 2 * pi * r;
	}
	
	@Override
	public void input() {
		System.out.print("Nhap ban kinh: ");
		this.r = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public void output() {
		System.out.printf("Chu vi la: %.6f%n", perimeter());
		System.out.printf("Dien tich la: %.6f", area());
	}
	public static void main(String[] args) {
		Circle cir = new Circle();
		cir.input();
		cir.output();
	}

}
