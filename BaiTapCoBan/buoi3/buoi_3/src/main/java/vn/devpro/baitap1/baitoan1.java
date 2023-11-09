package vn.devpro.baitap1;

import java.util.Scanner;

public class baitoan1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void ptb2(double a, double b, double c) {
		double x = 0;
		double d = b*b - 4*a*c;
		if (a == 0) {
			System.out.println("Phuong trinh khong xac dinh!");
		} else {
			if ( d < 0) {
				System.out.println("Phuong trinh vo nghiem!");
			} else if ( d == 0 ) {
				System.out.println("Phuong trinh co nghiem kep: ");
				x = -b / (2*a);
				System.out.printf("\tx1 = x2 = %.3f%n", x);
			} else {
				double x1 = (-b + Math.sqrt(d))/(2*a);
				double x2 = (-b - Math.sqrt(d))/(2*a);
				System.out.println("Phuong trinh co 2 nghiem phan biet: ");
				System.out.printf("\tx1 = %.3f", x1);
				System.out.printf("\tx2 = %.3f", x2);
			}
		}
	}
	
	public static void init() {
		// TODO Auto-generated method stub
		double a, b, c;
		System.out.println("Nhap he so cua phuong trinh: ");
		System.out.print("\tNhap he so a: ");
		a = Double.parseDouble(sc.nextLine());
		System.out.print("\tNhap he so b: ");
		b = Double.parseDouble(sc.nextLine());
		System.out.print("\tNhap he so c: ");
		c = Double.parseDouble(sc.nextLine());
		ptb2(a, b, c);
	}

}
