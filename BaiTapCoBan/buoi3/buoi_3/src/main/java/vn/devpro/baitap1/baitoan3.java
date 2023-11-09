package vn.devpro.baitap1;

import java.util.Scanner;

public class baitoan3 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static double cal(double a, double b) {
		double l = 0;
		if ( a < 50000000) {
			l = b - b * 0.1;
		} else if (a >= 50000000 && a <= 100000000) {
			l = b;
		} else if (a >= 100000000 && a <= 150000000) {
			l = b + a*0.05;
		} else {
			l = b + a*0.1;
		}
		return l;
	}
	
	public static void init() {
		double a, b;
		System.out.print("Nhap doanh so: ");
		a = Double.parseDouble(sc.nextLine());
		System.out.print("Nhap luong cung: ");
		b = Double.parseDouble(sc.nextLine());
		System.out.println("Luong thuc linh la: " + cal(a,b));
	}
}
