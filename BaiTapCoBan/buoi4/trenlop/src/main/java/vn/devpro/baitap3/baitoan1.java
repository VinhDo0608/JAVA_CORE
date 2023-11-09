package vn.devpro.baitap3;

import java.util.Scanner;

public class baitoan1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static long giaiThua(long n) {
		if(n == 1) return 1;
		return n * giaiThua(n-1);
	}
	
	public static void init() {
		long n;
		do{
			System.out.print("Nhap n: ");
			n = sc.nextLong();
			System.out.printf("n! = %d", giaiThua(n));
			break;
		} while (n >= 1);
	}
}
