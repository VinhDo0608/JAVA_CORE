package vn.devpro.baitap3;

import java.util.Scanner;

public class baitoan3 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static double tinhMu(double x, double e) {
		double t = 1;
		double a = 1;
		int i = 1;
		while (Math.abs(a) >= e) {
			a = Math.pow(x, i) / baitoan1.giaiThua(i);
			t += a;
			i++;
		}
		return t;
	}
	
	public static void init() {
		System.out.print("Nhap x: ");
		double x = sc.nextDouble();
		double e;
		do {
		System.out.print("Nhap e: ");
		e = sc.nextDouble();
		tinhMu(x, e);
		} while (e <= 0);
		
		System.out.printf("\tKet qua la: %.7f%n", tinhMu(x, e));
	}
}
