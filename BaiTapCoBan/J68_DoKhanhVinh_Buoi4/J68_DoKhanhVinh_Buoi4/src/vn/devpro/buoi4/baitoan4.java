package vn.devpro.buoi4;

import java.util.Scanner;

public class baitoan4 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static long giaiThua(long n) {
		if(n == 1) return 1;
		return n * giaiThua(n-1);
	}
	
	public static double tinhS(double x, double e) {
		double t = x;
		double a = 1;
		int i = 1;
		while (Math.abs(a) >= e) {
			a = Math.pow(-1, i)*Math.pow(x, 2*i +1) / giaiThua(2*i+1);
			t += a;
			i++;
		}
		return t;
	}

	public static void init() {
		System.out.print("Nhap x:");
		double x = Double.parseDouble(sc.nextLine());
		double e;
		do {
		System.out.print("Nhap e: ");
		e = sc.nextDouble();
		} while (e <= 0);
		
		System.out.printf("\tKet qua la: %.7f%n", tinhS(x, e));
	}
}