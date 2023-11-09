package vn.devpro.bai2;

import java.util.Scanner;

public class bai2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void convertToBinary(byte[] a, long n) {
		int i = 0;
		while (n > 0) {
			a[i] = (byte)(n % 2);
			n /= 2;
			i++;
		}
		i = 0;
		int j = a.length - 1;
		while (i < j) {
			byte tg = a[i];
			a[i] = a[j];
			a[j] = tg;
			i++;
			j--;
		}
	}
	
	public static void xuatMang(byte[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] a = new byte[64];
		System.out.print("Nhap so nguyen duong n: ");
		long n = sc.nextLong();
		System.out.print(n + "= ");
		for(int i = 0; i < a.length; i++) {
			a[i] = 0;
		}
		convertToBinary(a, n);
		xuatMang(a);
	}

}
