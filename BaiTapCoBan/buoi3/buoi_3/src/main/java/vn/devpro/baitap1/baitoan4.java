package vn.devpro.baitap1;

import java.util.Scanner;

public class baitoan4 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void init() {
		System.out.print("Nhap thang: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap nam: ");
		int b = Integer.parseInt(sc.nextLine());
		switch (a) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf("Thang %d co 31 ngay!",a);
			break;
		case 4: case 6: case 9: case 11:
			System.out.printf("Thang %d co 30 ngay!",a);
			break;
		case 2:
			if(b % 4 == 0 && b % 100 != 0 || b % 400 == 0) {
				System.out.printf("Thang %d co 29 ngay!",a);
			} else {
				System.out.printf("Thang %d co 28 ngay!",a);
			}
			break;
		default:
			System.out.println("Thang khong hop le");
		}
	}
}
