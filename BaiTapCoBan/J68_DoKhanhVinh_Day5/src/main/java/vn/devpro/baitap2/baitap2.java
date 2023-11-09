package vn.devpro.baitap2;

import java.util.Scanner;

public class baitap2 {

	static Scanner sc = new Scanner(System.in);
	
	public static void nhap(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print("Nhap tu tieng anh thu " + (i+1) + ": ");
			a[i] = sc.nextLine();
		}
	}
	
	public static void xuat(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void check(String[] a, String x) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].compareTo(x) == 0 ) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println(x + " co trong danh sach!");
		} else {
			System.out.println(x + " khong co trong danh sach!");
	}
}
	
	public static void sort(String[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i].compareTo(a[j]) < 0) {
					String tg = a[i];
					a[i] = a[j];
					a[j] = tg;
			}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Nhap so tu tieng anh: ");
		int n = Integer.parseInt(sc.nextLine());
		String[] a = new String[n];
		nhap(a);
		xuat(a);
		System.out.print("\nNhap tu muon kiem tra: ");
		String x = sc.nextLine();
		check(a, x);
		System.out.println("Danh sach sau khi sap xep: ");
		sort(a);
		xuat(a);
	}

}
