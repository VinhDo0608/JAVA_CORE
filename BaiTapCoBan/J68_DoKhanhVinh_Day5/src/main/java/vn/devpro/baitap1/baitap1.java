package vn.devpro.baitap1;

import java.util.Scanner;

public class baitap1 {
	
	static Scanner sc = new Scanner(System.in);
	static String[] name = {"toan", "van", "anh"};
	
	public static void nhap(double[][] a) {
		
		for(int i = 0 ; i < a.length; i++) {
			System.out.println("Nhap vao thong tin cua thi sinh thu: " + (i+1));
			do {
				System.out.print("\tNhap diem toan: ");
				a[i][0] = Double.parseDouble(sc.nextLine());
			}while(a[i][0] < 0 || a[i][0] > 10);
			
			do {
				System.out.print("\tNhap diem van: ");
				a[i][1] = Double.parseDouble(sc.nextLine());
			}while(a[i][1] < 0 || a[i][1] > 10);
			
			do {
				System.out.print("\tNhap diem anh: ");
				a[i][2] = Double.parseDouble(sc.nextLine());
			}while(a[i][2] < 0 || a[i][2] > 10);

		}
	}
	
	public static double tongDiem(double toan, double van, double anh) {
		return toan+van+anh*2;
	}
	
	public static void xuat(double[][] a) {
		System.out.println("THONG TIN THI SINH");
		for (int i = 0; i < a.length; i++) {
				System.out.printf("\tDiem toan: %.3f%n", a[i][0]);
				System.out.printf("\tDiem van: %.3f%n", a[i][1]);
				System.out.printf("\tDiem anh: %.3f%n", a[i][2]);
				System.out.printf("\tTong Diem: %.3f%n", tongDiem(a[i][0], a[i][1], a[i][2]));
		}
	}
	
	public static void sapXep(double[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					double tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.print("Nhap so luong thi sinh: ");
		int n = Integer.parseInt(sc.nextLine());
		double[][] a = new double[n][3];
		nhap(a);
		
		double[] tong  = new double[n];
		xuat(a);
		for (int i = 0; i < a.length; i++) {
			tong[i] = tongDiem(a[i][0], a[i][1], a[i][2]);
		}
		sapXep(tong);
		System.out.println("Tong diem sau khi sap xep la: ");
		for (int i = 0; i < tong.length; i++) {
			System.out.print(tong[i] + " ");
		}
		System.out.println("\n5 tong diem cao nhat la: ");
		for (int i = tong.length -5; i < tong.length; i++) {
			System.out.println(tong[i] + " ");
		}
	}
}