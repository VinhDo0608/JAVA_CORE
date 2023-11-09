package vn.devpro.baitap3;

import java.util.Scanner;

class PhanSo{
	int tuSo, mauSo;
	
	static Scanner sc = new Scanner(System.in);
	
	public void nhap() {
		System.out.print("\tNhap tu so: ");
		tuSo = Integer.parseInt(sc.nextLine());
		do {
			System.out.print("\tNhap mau so: ");
			mauSo = Integer.parseInt(sc.nextLine());
		} while (mauSo == 0);
	}
	
	public static int UCLN(int a, int b) {
		if (a<b) {
			int t = a; a = b; b = t;
		}
		int r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}
	
	public void toiGian() {
		int a = Math.abs(tuSo);
		int b = Math.abs(mauSo);
		int u = UCLN(a, b);
		if (u > 1) {
			tuSo /= u;
			mauSo /= u;
		}
	}
	
	public void xuat() {
		System.out.println(tuSo + "/" + mauSo);
	}
}

public class baitoan4 {
	
	public static void init() {

		PhanSo P = new PhanSo();
		P.nhap();
		P.toiGian();
		System.out.print("Phan so sau khi toi gian: ");
		P.xuat();
	}
	
}
