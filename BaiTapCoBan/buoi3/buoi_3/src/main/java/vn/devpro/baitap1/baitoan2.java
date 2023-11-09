package vn.devpro.baitap1;

import java.util.Scanner;

public class baitoan2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void xepLoai(double a) {
		if (a >=0 && a <= 10) {
		if (a >= 8) {
			System.out.println("Xep loai gioi!");
		} else if ( a >=7 && a < 8) {
			System.out.println("Xep loai kha!");
		} else if (a >=5 && a < 7) {
			System.out.println("Xep loai trung binh!");
		} else {
			System.out.println("Xep loai yeu!");
		}
	} else {
		System.out.println("Diem khong hop le!");
	}
	}
	
	public static void init() {
		double a;
		System.out.print("Nhap vao diem tong ket: ");
		a = Double.parseDouble(sc.nextLine());
		xepLoai(a);
	}
}
